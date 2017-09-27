/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author davii
 */
public abstract class Vendedor {
    private int id;
    private String nome;
    private int cpf;
    private double salario;
    
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
    
    public abstract double calcularComissao(double i);
    
    public abstract double calcularBonificacao();
    
}
