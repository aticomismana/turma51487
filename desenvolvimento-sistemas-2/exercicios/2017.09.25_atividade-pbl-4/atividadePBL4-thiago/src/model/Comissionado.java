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
public class Comissionado extends Vendedor {
    
    public double calculaComissao(double valorCompra){
        double comissao = valorCompra * 0.15;
        
        return comissao;
    }
    
    public void concederBonificacao(){
        if(this.getMesesContrato() > 12){
            double bonificaoao = this.getSalario() * 0.05;
        
            this.setSalario(bonificaoao);
        }
    }
}
