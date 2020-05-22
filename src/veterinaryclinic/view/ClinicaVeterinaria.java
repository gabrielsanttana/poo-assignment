package veterinaryclinic.view;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import java.util.Map;

import veterinaryclinic.controller.*;
import veterinaryclinic.model.*;

public class ClinicaVeterinaria implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Dados Atualizados!!");
        System.out.println(arg);
    }
    
    public void listaClientes()
    {
        Map<Integer, Client> clients = Controller.getAllClientes();
        for (int i = 0; i < clients.size(); i++)
        	System.out.println(clients.get(i));        
    }
    
    public void menuPrincipal()
    {
        Scanner sc = new Scanner(System.in);
        Controller.setObserver(this);
        while (true)
        {
            System.out.println("1- Inserir cliente");
            System.out.println("2- Listar clientes");
            System.out.println("3 - Inserir animal");
            System.out.println("4 - Listar animais");
            System.out.println("0 - Encerrar");
            
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    Controller.addCliente("Plinio Vilela", "endereco", "(19)98787-9988", "15675-900", "teste@email.com");
                    break;
                case 2:
                    listaClientes();
                    break;
                case 3:
                    System.out.println("Digite o ID do cliente: ");
                    int clientId = sc.nextLine();

                    System.out.println("Digite o nome do animal: ");
                    String animalName = sc.nextLine();

                    System.out.println("Digite a idade do animal: ");
                    int animalAge = sc.nextInt();

                    System.out.println("Digite o sexo do animal: ");
                    String animalSex = sc.nextLine();

                    Controller.addAnimal(clientId, animalName, animalAge, animalSex, null, null);
                    break;
                case 4: 
                    break;
                case 0:
                	sc.close();
                    return;
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ClinicaVeterinaria().menuPrincipal();
    }
    
}
