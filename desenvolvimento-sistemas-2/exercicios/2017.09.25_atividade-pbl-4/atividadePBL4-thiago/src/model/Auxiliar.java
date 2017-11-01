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
public class Auxiliar extends Vendedor {
    
    public void calculaComissao(double valorCompra){
        double comissao = 0;
        if(valorCompra > 200){
            comissao = valorCompra * 0.02;
        } else {
            comissao = valorCompra * 0.05;
        }
        
        this.setSalario( this.getSalario() + comissao );
    }
    
    public void concederBonificacao(){
        if(this.getMesesContrato() > 12){
            double bonificaoao = this.getSalario() * 0.02;
        
            this.setSalario(this.getSalario() + bonificaoao);
        }
    }
}
