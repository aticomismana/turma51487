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
public class Diretor {
    private int id;
    private String nome;
    private int cpf;
    private double salario;
    
    public Diretor(){
        
    }
    
    public Diretor(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
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
    
    public double calcularComissao(double venda){
        double comissao = venda*0.05;
        
        return comissao;
    }
    public double bonificacao(){
        double bonificacao = (this.getSalario()*12)*0.10;
        return bonificacao;
    }
}
