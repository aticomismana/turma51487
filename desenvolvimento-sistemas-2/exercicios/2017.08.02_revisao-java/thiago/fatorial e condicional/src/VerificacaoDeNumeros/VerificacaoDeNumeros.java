/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerificacaoDeNumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class VerificacaoDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(args));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(args));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "O númeo 1 é maior que o número 2");
        } else if(num2 < num1){
            JOptionPane.showMessageDialog(null, "O númeo 2 é maior que o número 1");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
    
}
