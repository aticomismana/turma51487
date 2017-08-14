/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl2;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double desconto;
        Tampa tampa = new Tampa();
        tampa.setCor("AZUL");
        tampa.setDescricao("CADÊ A TAMPA?");
        Liquidificador liquificador = new Liquidificador("TEGIN", 300.0, 110.0, tampa);
        if(liquificador.setVoltagem(220)){
           System.out.println("A VOLTAGEM FOI SETADA! " );
        } else {
            System.out.println("VOLTAGEM INCORRETA");
        }
        desconto = liquificador.calculaDesconto(8);
        System.out.println("VALOR DO DESCONTO DO LIQUIDIFICADOR: " + desconto);
        
        
        
        Batedeira batedeira = new Batedeira("BATE BATE", 50.0, 220.0);
        desconto = batedeira.calculaDesconto(12);
        double calculaQuantidadeMedia = batedeira.calculaQuantidade(200, 100);
        batedeira.setQuantidadeDeHelices(2);
        if(batedeira.setVoltagem(110)){
           System.out.println("A VOLTAGEM FOI SETADA! " );
        } else {
            System.out.println("VOLTAGEM INCORRETA");
        }
        System.out.println("VALOR DO DESCONTO DA BATEDEIRA: " + desconto);
        System.out.println("VALOR DO QUANTIDADE MEDIA DA BATEDEIRA: " + calculaQuantidadeMedia);
        
        
        
        Ferro ferro = new Ferro("FERRO PASSA PASSA", 40, 30);
        if(ferro.setVoltagem(300)){
           System.out.println("A VOLTAGEM FOI SETADA! " );
        } else {
            System.out.println("VOLTAGEM INCORRETA");
        }
        desconto = ferro.calculaDesconto(5);
        System.out.println("VALOR DO DESCONTO DO FERRO: " + desconto);
        
        
    }
    
}
