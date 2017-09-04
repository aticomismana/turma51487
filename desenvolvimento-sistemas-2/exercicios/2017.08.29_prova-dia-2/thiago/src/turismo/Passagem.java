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
public class Passagem {
    private String dataIda;
    private String dataVolta;
    private String origem;
    private String destino;
    private double valor;
    
    public Passagem(double valor){
        this.valor = valor;
        Pacote.sumValorTotal(valor);
    }

    public String getOrigem() {
        return origem;
    }

    public String getDataIda() {
        return dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public String getDestino() {
        return destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getValor() {
        return valor;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
