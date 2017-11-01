/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Vendedor {
    private int id;
    private String nome;
    private String cpf;
    private Double salario;
    private int mesesContrato;
    private String tipo_vendedor;

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoVendedor(String tipo_vendedor) {
        this.tipo_vendedor = tipo_vendedor;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoVendedor() {
        return tipo_vendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


}
