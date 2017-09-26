/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import view.*;
import model.*;
import dao.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aluno
 */
public class ControllerListagem implements ActionListener, KeyListener{
    JfListar viewCRUD = new JfListar();
    VendedorDAO vendedorDAO = new VendedorDAO();
    
    public ControllerListagem(JfListar viewCRUD){
        this.viewCRUD = viewCRUD;
        
        DefaultTableModel tabela = new DefaultTableModel();
        viewCRUD.tabelaListagem.setModel(tabela);
        tabela.addColumn("Nome");
        tabela.addColumn("CPF");
        tabela.addColumn("Salario");
        tabela.addColumn("Meses de contratado");
        ArrayList<Vendedor> listaVendedor = vendedorDAO.listaVendedor();

        Object [] coluna  = new Object[4];
        int numRegistros = listaVendedor.size();
        for(int i = 0; i < numRegistros; i++){
            coluna[0] = listaVendedor.get(i).getNome();
            coluna[1] = listaVendedor.get(i).getCpf();
            coluna[2] = listaVendedor.get(i).getSalario().toString();
            coluna[3] = listaVendedor.get(i).getMesesContrato();
            tabela.addRow(coluna);
        }
    }
    
    public void actionPerformed(ActionEvent e){
//        if(e.getSource() == viewCRUD.botaoCadastrar){
//          
//        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
