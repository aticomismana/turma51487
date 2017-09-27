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
    DefaultTableModel tabela = new DefaultTableModel();
        
    public ControllerListagem(JfListar viewCRUD){
        this.viewCRUD = viewCRUD;
        this.viewCRUD.botao_cadastro.addActionListener(this);
        this.viewCRUD.botao_excluir.addActionListener(this);

        viewCRUD.tabelaListagem.setModel(tabela);
        tabela.addColumn("ID");
        tabela.addColumn("Nome");
        tabela.addColumn("CPF");
        tabela.addColumn("Salario");
        tabela.addColumn("Meses de contratado");
        ArrayList<Vendedor> listaVendedor = vendedorDAO.listaVendedor();

        Object [] coluna  = new Object[5];
        int numRegistros = listaVendedor.size();
        for(int i = 0; i < numRegistros; i++){
            coluna[0] = listaVendedor.get(i).getId();
            coluna[1] = listaVendedor.get(i).getNome();
            coluna[2] = listaVendedor.get(i).getCpf();
            coluna[3] = listaVendedor.get(i).getSalario().toString();
            coluna[4] = listaVendedor.get(i).getMesesContrato();
            tabela.addRow(coluna);
        }
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == viewCRUD.botao_cadastro){
            JF jf = new JF();
            jf.setVisible(true);
            Controller controller = new Controller(jf);
            viewCRUD.dispose();
            jf.setLocationRelativeTo(null);
        }
        if(e.getSource() == viewCRUD.botao_excluir){
            String id = tabela.getValueAt(viewCRUD.tabelaListagem.getSelectedRow(), 0).toString();
            int identificador = Integer.parseInt(id);
            tabela.removeRow(viewCRUD.tabelaListagem.getSelectedRow());
            vendedorDAO.eliminarVendedor(identificador);
        }
        
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
