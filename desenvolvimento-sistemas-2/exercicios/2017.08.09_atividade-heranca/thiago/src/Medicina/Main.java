/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicina;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String crm;
        String nome;
        String salario;
        String idade;
        

        crm = JOptionPane.showInputDialog(null, args, "Informe o número de CRM do CIRURGIÃO: ");
        nome = JOptionPane.showInputDialog(null, args, "Informe o nome do médico CIRURGIÃO: ");
        salario = JOptionPane.showInputDialog(null, args, "Informe o salário do CIRURGIÃO: ");
        idade = JOptionPane.showInputDialog(null, args, "Informe a idade do CIRURGIÃO: ");
        
        int numeroCrm = Integer.parseInt(crm);
        double quantiaSalario = Double.parseDouble(salario);
        int anosDeIdade = Integer.parseInt(idade);
        
        MedicoCirurgiao cirurgiao = new MedicoCirurgiao();
        cirurgiao.setNome(nome);
        cirurgiao.setSalario(quantiaSalario);
        cirurgiao.setIdade(anosDeIdade);
        cirurgiao.setCrm(numeroCrm);
        if( cirurgiao.medicoAposentado() ){
            JOptionPane.showMessageDialog(null, "O valor da aposentadoria do médico é: " + cirurgiao.valorAposentadoria());
        } else {
            JOptionPane.showMessageDialog(null, "Ainda não pode se aposentar!");
        }
        
        crm = JOptionPane.showInputDialog(null, args, "Informe o número de CRM do AUXILIAR: ");
        nome = JOptionPane.showInputDialog(null, args, "Informe o nome do médico AUXILIAR: ");
        salario = JOptionPane.showInputDialog(null, args, "Informe o salário do AUXILIAR: ");
        idade = JOptionPane.showInputDialog(null, args, "Informe a idade do AUXILIAR: ");
        
        MedicoAuxiliar medicoAuxiliar = new MedicoAuxiliar();
        medicoAuxiliar.setNome(nome);
        medicoAuxiliar.setSalario(quantiaSalario);
        medicoAuxiliar.setIdade(anosDeIdade);
        medicoAuxiliar.setCrm(numeroCrm);
        if( medicoAuxiliar.medicoAposentado() ){
            JOptionPane.showMessageDialog(null, "O valor da aposentadoria do médico é: " + medicoAuxiliar.valorAposentadoria());
        } else {
            JOptionPane.showMessageDialog(null, "Ainda não pode se aposentar!");
        }
    }
    
}
