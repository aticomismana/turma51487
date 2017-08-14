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
public class Ferro extends EletroDomestico {
    
    public Ferro(String marca, double preco, double voltagem){
        super(marca, preco, voltagem);
    }
    
    public Ferro(String marca, double voltagem){
        super(marca, voltagem);
    }
    
    @Override
    public double calculaDesconto(int mes){
        double desconto = 0;
         if( mes == 5){
            desconto = super.getPreco() * 0.15;
        }
        return desconto;
    }
    
    @Override
    public boolean setVoltagem(double voltagem) {
        if(voltagem == 110 || voltagem == 220 || voltagem == 5) {
            super.voltagem = voltagem;
            return true;
        }
        return false;
    }
}
