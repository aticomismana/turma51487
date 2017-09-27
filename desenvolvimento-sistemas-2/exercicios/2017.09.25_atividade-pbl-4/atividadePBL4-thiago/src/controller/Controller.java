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
/**
 *
 * @author Aluno
 */
public class Controller implements ActionListener, KeyListener{
    JF viewCRUD = new JF();

    public Controller(JF viewCRUD){
        this.viewCRUD = viewCRUD;
        this.viewCRUD.botaoCadastrar.addActionListener(this);
        this.viewCRUD.botaoRetornar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == viewCRUD.botaoCadastrar){
            VendedorDAO vendedor = new VendedorDAO();
            String nome = viewCRUD.nome.getText();
            String cpf = viewCRUD.cpf.getText();
            String salario = viewCRUD.salario.getText();
            int valor_compra = Integer.parseInt(viewCRUD.valor_compra.getText());
            String mesesContratado = viewCRUD.mesesContratado.getText();
            String tipo_funcionario = viewCRUD.tipo_funcionario.getSelectedItem();
            if(tipo_funcionario == "comissionado"){
                Comissionado comissionado = new Comissionado();
                comissionado.setSalario(Double.parseDouble(salario));
                comissionado.setMesesContrato(Integer.parseInt(mesesContratado));
                comissionado.calculaComissao(valor_compra);
                comissionado.concederBonificacao();
                vendedor.insereVendedor(nome, comissionado.getSalario().toString(), mesesContratado, cpf, tipo_funcionario);
            } else if(tipo_funcionario == "diretor"){
                Diretor diretor = new Diretor();
                diretor.setSalario(Double.parseDouble(salario));
                vendedor.insereVendedor(nome, diretor.getSalario().toString(), mesesContratado, cpf, tipo_funcionario);
            } else if(tipo_funcionario == "auxiliar"){
                Auxiliar auxiliar = new Auxiliar();
                auxiliar.setSalario(Double.parseDouble(salario));
                auxiliar.setMesesContrato(Integer.parseInt(mesesContratado));
                auxiliar.calculaComissao(valor_compra);
                auxiliar.concederBonificacao();
                vendedor.insereVendedor(nome, auxiliar.getSalario().toString(), mesesContratado, cpf, tipo_funcionario);
            }

            this.voltarLista();

        }
        if(e.getSource() == viewCRUD.botaoRetornar){
            this.voltarLista();
        }
    }
    public void voltarLista() {
        JfListar jfListagem = new JfListar();
        jfListagem.setVisible(true);
        ControllerListagem controllerListagem = new ControllerListagem(jfListagem);

        viewCRUD.dispose();
        jfListagem.setLocationRelativeTo(null);
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
