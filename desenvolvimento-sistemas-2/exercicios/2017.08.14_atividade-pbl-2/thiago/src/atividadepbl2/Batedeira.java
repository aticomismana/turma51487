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
public class Batedeira extends EletroDomestico implements CalcularQuantidadeMedia {
    private int quantidadeDeHelices = 1;
    
    public Batedeira(String marca, double preco, double voltagem){
        super(marca, preco, voltagem);
    }
    
    public Batedeira(String marca, double voltagem){
        super(marca, voltagem);
    }

    @Override
    public double calculaDesconto(int mes){
        double desconto = 0;
         if( mes == 12){
            desconto = super.getPreco() * 0.20;
        }
        return desconto;
    }

    public void setQuantidadeDeHelices(int quantidadeDeHelices) {
        this.quantidadeDeHelices = quantidadeDeHelices;
    }
    
    @Override
    public double calculaQuantidade(double quantidade, double capacidade){
        
        double resultado = quantidade / capacidade;
        
        resultado *= this.quantidadeDeHelices;
        
        return resultado;
    }
    
    @Override
    public boolean setVoltagem(double voltagem) {
        if(voltagem == 110 || voltagem == 220) {
            super.voltagem = voltagem;
            return true;
        }
        return false;
    }
}
