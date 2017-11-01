/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatorial;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(args));
               
        int fat = 1;
        for( int i = 2; i <= num; i++ )
        { 
             fat *= i;
        }
        
        JOptionPane.showMessageDialog(null, fat);
    }
    
}
