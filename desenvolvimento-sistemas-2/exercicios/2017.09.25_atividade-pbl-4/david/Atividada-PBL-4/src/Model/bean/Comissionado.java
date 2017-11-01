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
public class Comissionado extends Diretor{
    private int tempoEmpresa;
    
    public Comissionado(){
        
    }
    
    public Comissionado(String nome, int cpf, double salario, int tempoEmpresa) {
        super(nome, cpf, salario);
        this.tempoEmpresa = tempoEmpresa;
    }
    
    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }
    
    @Override
    public double calcularComissao(double venda){
        double comissao = venda*0.15;
        
        return comissao;
    }

    @Override
    public double calcularBonificacao(){
        double bonificacao = 0;
        
        if(this.getTempoEmpresa() >= 12){
            bonificacao = (this.getSalario() * 12)*0.05;
            return bonificacao;
        }else{
            return bonificacao;
        }
    }
}
