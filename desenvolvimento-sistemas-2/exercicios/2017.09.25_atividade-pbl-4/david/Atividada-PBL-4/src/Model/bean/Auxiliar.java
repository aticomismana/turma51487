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
public class Auxiliar extends Diretor{
    private int tempoContrato;
    
    public Auxiliar(){
        
    }
    
    public Auxiliar(String nome, int cpf, double salario, int tempoContrato) {
        super(nome, cpf, salario);
        this.tempoContrato = tempoContrato;
    }
    
    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }
    
    @Override
    public double calcularComissao(double venda){
        double comissao = 0;
        if(venda >= 200){
            comissao = venda*0.05;
            return comissao;
        }if(venda >= 0&& venda <=199){
            comissao = venda*0.2;
            return comissao;
        }else{
            return comissao;
        }
    }

    @Override
    public double bonificacao(){
        double bonificacao = 0;
        if(this.getTempoContrato() >= 12){
            bonificacao = (this.getSalario()*12)*0.2;
            return bonificacao;
        }else{
            return bonificacao;
        }
    }
}
