/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author aluno
 */
public abstract class Html {
    protected double tamanho;
    protected String cor;
    static int qtdTextos;

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public double getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    
    
}
