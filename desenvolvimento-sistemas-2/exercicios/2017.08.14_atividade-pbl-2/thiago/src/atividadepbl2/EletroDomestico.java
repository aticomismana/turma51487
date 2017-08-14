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
public abstract class EletroDomestico {
    protected String marca;
    protected double preco;
    protected double voltagem;
    
    public EletroDomestico(String marca, double preco, double voltagem){
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public EletroDomestico(String marca, double voltagem){
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }    
   
    public abstract double calculaDesconto(int mes);
    
    public abstract boolean setVoltagem(double voltagem);
}
