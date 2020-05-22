package veterinaryclinic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Plinio Vilela
 */
public class ClienteDAO extends Observable{
    private static ClienteDAO instance;
    private List<Cliente> clientes;
    private int id;
    
    private ClienteDAO(){
        clientes = new ArrayList();
        id = 0;
    }
    
    // Singleton
    public static ClienteDAO getInstance(){
       if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }
    
    
// Partial CRUD    
    // Create
    public void addCliente(String nome, String endereco, String telefone, String cep){
        Cliente cliente = new Cliente(id,nome,endereco,telefone,cep);
        id++;
        clientes.add(cliente);
        setChanged();
        notifyObservers(cliente);
    }
    
    // RetrieveAll
    public List getAllClientes(){        
        return clientes;
    }
    
    // RetrieveById
    // Os grupos devem implementar as modificacoes para permitir que um cliente seja
    // encontrado a partir de um id (inteiro).
    // Sugestao, ao inves de usar um List, usar um Map.
    public Cliente getClienteById(int id){
        for(Cliente cliente : clientes){
            if(cliente.getId()==id){
                return cliente;
            }
        }
        return null;
    }
    
    // RetrieveByName
    
    // Updade
    
    // Delete   
    public void deleteCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    
}
