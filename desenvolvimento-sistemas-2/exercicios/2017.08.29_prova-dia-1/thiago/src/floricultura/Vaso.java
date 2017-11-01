/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;


/**
 *
 * @author Thiago
 */
public class Vaso {
    
    public double calculaPreco(int vaso, int tamanho){
        double preco = 0;
        
        if(vaso == 1 && tamanho == 1 || tamanho == 2){
            preco = 8.00;
        }
        if(vaso == 1 && tamanho == 3){
            preco = 10.00;
        }
        if(vaso == 2 && tamanho == 1 || tamanho == 2){
            preco = 4.00;
        }
        if(vaso == 2 && tamanho == 3){
            preco = 6.00;
        }
        
        return preco;
    }
}
