package view;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Veterinary;

public class VeterinaryTableModel extends AbstractTableModel {

    private List<Veterinary> listVeterinary;
    private String[] colunas = {"Nome","Endere�o","Telefone"};    


    public VeterinaryTableModel(List<Veterinary> listVeterinary) {
        this.listVeterinary = listVeterinary; 
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    } 

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return listVeterinary.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {        
        Veterinary veterinary = listVeterinary.get(linha);         
        switch (coluna) {
            case 0:
                return veterinary.getVeterinaryName();
            case 1:
                return veterinary.getVeterinaryAddress();    
            case 2:
                return veterinary.getVeterinaryPhone();
        }        
        return null;        
    }



    /**
     * 
     */
    private static final long serialVersionUID = 8089116544555428084L;


}
