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
public class Diretor extends Vendedor{
    
    public Diretor(){
        
    }
    
    public Diretor(String nome, int cpf, double salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
    }
    
    @Override
    public double calcularComissao(double venda){
        double comissao = venda*0.05;
        
        return comissao;
    }
    
    @Override
    public double calcularBonificacao(){
        double bonificacao = (this.getSalario()*12)*0.10;
        return bonificacao;
    }
}
