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
public class Passeio {
    private String dia;
    private String horario;
    private String tempoTotal;
    private double valor;
    
    public Passeio(double valor){
        this.valor = valor;
        Pacote.sumValorTotal(valor);
    }
    
    public String getDia() {
        return dia;
    }

    public String getHorario() {
        return horario;
    }

    public String getTempoTotal() {
        return tempoTotal;
    }

    public double getValor() {
        return valor;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setTempoTotal(String tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
