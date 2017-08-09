/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dataDeNascimento = JOptionPane.showInputDialog(null, args, "Informe a data de nascimento");
        String nome = JOptionPane.showInputDialog(null, args, "Informe o nome");
        String sobrenome = JOptionPane.showInputDialog(null, args, "Informe o sobrenome");


        Date dataNascimento = new Date(dataDeNascimento);
        HeartRates heartRate = new HeartRates(nome, sobrenome, dataNascimento);
        double frequenciaMax = heartRate.calculaFrequenciaMaxima();
        double frequenciaMin = heartRate.calculaFrequenciaMinimo();
        int idade = heartRate.calculaIdade(dataNascimento);
        double intervaloMin = heartRate.calculaIntervaloMin(frequenciaMin);
        double intervaloMax = heartRate.calculaIntervaloMin(frequenciaMax);

        
        System.out.println("Frequqencia maxima: " + frequenciaMax);
        System.out.println("Frequencia minima:" + frequenciaMin);
        System.out.println("Idade: " + idade);
        System.out.println("Intervalor minimo: " + intervaloMin);
        System.out.println("Intervalor maximo: " + intervaloMax);
    }
    
}
