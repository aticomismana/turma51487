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
public class Hospedagem {
    private int diasDeViagem;
    private int diaIda;
    private int diaVolta;
    private double valorDiaria;
    private double valorTotal;
    
    
    public Hospedagem(double valorDiaria, int diasDeViagem, int quantidadePessoas){
        this.valorDiaria = valorDiaria;
        this.diasDeViagem = diasDeViagem;
        this.valorTotal = valorDiaria * diasDeViagem;
        Pacote.sumValorTotal(valorTotal);
        if(quantidadePessoas >= 2){
            Pacote.reduceValorTotal(Pacote.getValorTotal() * 0.2);  
        }
    }

    public int getDiaIda() {
        return diaIda;
    }

    public int getDiaVolta() {
        return diaVolta;
    }

    public int getDiasDeViagem() {
        return diasDeViagem;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDiaIda(int diaIda) {
        this.diaIda = diaIda;
    }

    public void setDiaVolta(int diaVolta) {
        this.diaVolta = diaVolta;
    }

    public void setDiasDeViagem(int diasDeViagem) {
        this.diasDeViagem = diasDeViagem;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
