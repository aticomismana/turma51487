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
public class Liquidificador extends EletroDomestico implements CalcularQuantidadeMedia {
    private Tampa tampa;
    private int quantidadeDeHelices;
    
    public Liquidificador(String marca, double preco, double voltagem){
        super(marca, preco, voltagem);
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public Liquidificador(String marca, double preco, double voltagem, Tampa tampa){
        super(marca, preco, voltagem);
    }
    
    public Liquidificador(String marca, double voltagem){
        super(marca, voltagem);
    }
    
    public Tampa getTampa() {
        return tampa;
    }

    public int getQuantidadeDeHelices() {
        return quantidadeDeHelices;
    }

    public void setQuantidadeDeHelices(int quantidadeDeHelices) {
        this.quantidadeDeHelices = quantidadeDeHelices;
    }
    
    @Override
    public double calculaDesconto(int mes){
        double desconto = 0;
         if( mes == 8){
            desconto = 0.10 * super.getPreco();
        }
        return desconto;
    }
    
    @Override
    public double calculaQuantidade(double quantidade, double capacidade){
        
        double resultado = quantidade / capacidade;
                
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
