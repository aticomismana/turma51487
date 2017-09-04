/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo;

/**
 *
 * @author aluno
 */
public class Pacote {
    private static double valorTotal = 0;

    public static double getValorTotal() {
        return valorTotal;
    }

    public static void sumValorTotal(double valorTotal) {
        Pacote.valorTotal += valorTotal;
    }
    
    public static void reduceValorTotal(double desconto) {
        Pacote.valorTotal -= desconto;
    }
    
    public static void setValorTotal(double valorTotal){
        Pacote.valorTotal = valorTotal;
    }
    
    private static boolean verificaDesconto(){
        return Pacote.valorTotal > 3000;
    }
    
    public static double calculaTotal(int quantidadePessoas){
        
        Pacote.setValorTotal(Pacote.getValorTotal() * quantidadePessoas);
                
        return Pacote.getValorTotal();
    }
    
    public static boolean descontoAdicional(){
        
        if(Pacote.verificaDesconto()){
            Pacote.reduceValorTotal(Pacote.getValorTotal() * 0.05);
            return true;
        }
        
        return false;
    }
    
}
