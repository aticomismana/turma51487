/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo;

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
        
        int tipoPacote = 0;
        
        do {
            tipoPacote = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um pacote \n"
                            + "1 - Passagem, translado, hospedagem, passeio turistico \n"
                            + "2 - Passagem e hospedagem \n"
                            + "3 - Apenas passagem"));
            if(tipoPacote > 3 || tipoPacote == 0){
                JOptionPane.showMessageDialog(null, "Opção invalida!");                
            }
        } while(tipoPacote > 3 || tipoPacote == 0);
        
        

        int quantidadePessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas"));
        double valorPassagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da passagem"));
        String cidadeDestino = JOptionPane.showInputDialog(null, "Informe a cidade de origem");
        String cidadeOrigem = JOptionPane.showInputDialog(null, "Informe a cidade de destino");

        Passagem passagem = new Passagem(valorPassagem);
        passagem.setDestino(cidadeDestino);
        passagem.setOrigem(cidadeOrigem);
        
        int diasViagem;
        double valorDiaria;
        double total = 0;
        Hospedagem hospedagem;
        
        switch(tipoPacote){
            case 1:
                int quantidadeDePasseios = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "Vc ganhou um passeio gratis! \n"
                        + "Informe a quantidade de passeios"));
                
                double valorPadrao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor padrão do translado"));
                Translado translado = new Translado(valorPadrao);
                
                diasViagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de dias da viagem"));

                valorDiaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diaria"));
                
                double valor = 0;
                for (int i = 0; i <= quantidadeDePasseios; i++) {
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do " + (i + 1) + "º passeio"));
                    Passeio passeio = new Passeio(valor);
                }
                
                Pacote.calculaTotal(quantidadePessoas);

                hospedagem = new Hospedagem(valorDiaria, diasViagem, quantidadePessoas);
                
                total = Pacote.getValorTotal();
                break;
            case 2:
                diasViagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de dias da viagem"));

                valorDiaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da diaria"));
                
                Pacote.calculaTotal(quantidadePessoas);
                
                hospedagem = new Hospedagem(valorDiaria, diasViagem, quantidadePessoas);
                
                total = Pacote.getValorTotal();
                break;
            case 3:
                total = Pacote.getValorTotal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");
                break;
        }
        
        if(Pacote.descontoAdicional()){
            JOptionPane.showMessageDialog(null, "Você recebeu um desconto de 5%");
        }
        
        if(tipoPacote <= 3 ){
            JOptionPane.showMessageDialog(null, "Total a pagar R$ " + total);
        }
    }
    
}
