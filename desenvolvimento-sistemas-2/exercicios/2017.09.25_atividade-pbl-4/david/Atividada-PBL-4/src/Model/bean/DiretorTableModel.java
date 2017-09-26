/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author davii
 */
public class DiretorTableModel extends AbstractTableModel{

    private List<Diretor> diretores = new ArrayList<>();
    private String[] colunas = {"Nome", "Cpf", "Salario"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return diretores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return diretores.get(linha).getNome();
            case 1:
                return diretores.get(linha).getCpf();
            case 2:
                return diretores.get(linha).getSalario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                diretores.get(linha).setNome((String) valor);
                break;
            case 1:
                diretores.get(linha).setCpf(Integer.parseInt((String) valor));
                break;
            case 2:
                diretores.get(linha).setSalario(Double.parseDouble((String) valor));
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Diretor dir){
        this.diretores.add(dir);
        this.fireTableDataChanged();
    }
    
    public void removoRow(int linha){
        this.diretores.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
