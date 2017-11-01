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
public class Translado {
    private double distancia;
    private double valorPadrao;
    private String dataIda;
    private String dataVolta;
    
    public Translado(double valorPadrao){
        this.valorPadrao = valorPadrao;
        Pacote.sumValorTotal(valorPadrao);
    }

    public String getDataIda() {
        return dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }
    
    
}
