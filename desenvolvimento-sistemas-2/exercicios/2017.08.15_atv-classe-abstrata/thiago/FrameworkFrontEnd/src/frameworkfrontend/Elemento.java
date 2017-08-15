/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkfrontend;

/**
 *
 * @author Aluno
 */
public abstract class Elemento {
    private String cor;
    private double tamanho;

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
