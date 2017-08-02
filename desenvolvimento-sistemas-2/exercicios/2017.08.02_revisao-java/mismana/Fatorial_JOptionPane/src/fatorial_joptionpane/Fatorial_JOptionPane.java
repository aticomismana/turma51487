package fatorial_joptionpane;

import javax.swing.JOptionPane;

public class Fatorial_JOptionPane {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
        JOptionPane.showMessageDialog(null, "O resultado é " + fatorial(x));
    }
    
    public static long fatorial(long num) {
        if (num <=1 )  return 1;
        else  return num * fatorial(num - 1);
    }
}