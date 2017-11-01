package model;

import java.util.Date;

public class Salario {
    private Funcao funcao;
    private Nivel nivel;
    private Date dataVigencia;
    private Double valor;

    public Salario(Funcao funcao, Nivel nivel, Date dataVigencia, Double valor) {
        this.funcao = funcao;
        this.nivel = nivel;
        this.dataVigencia = dataVigencia;
        this.valor = valor;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Date getDataVigencia() {
        return dataVigencia;
    }

    public void setDataVigencia(Date dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}