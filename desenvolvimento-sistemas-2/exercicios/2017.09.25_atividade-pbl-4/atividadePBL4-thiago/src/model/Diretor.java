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
public class Diretor extends Vendedor {
   
     public void calculaComissao(double valorCompra){
        double comissao = valorCompra * 0.05;
        
        this.setSalario(this.getSalario() + comissao);
    }
     
    public void concederBonificacao(){
        double bonificaoao = this.getSalario() * 0.10;
        
        this.setSalario(this.getSalario() + bonificaoao);
    }
}
