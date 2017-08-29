/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Violeta extends Planta{
    private static ArrayList especiesCadastradas = new ArrayList();
    private double preco = 7.50; 

     public static int getQuantidadeEspecies(){
        return especiesCadastradas.size();
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Violeta(int ultimoDiaRegacao){
        super(ultimoDiaRegacao);
        especiesCadastradas.add(this);
    }
    
    @Override
    public boolean regar(int dia){
        if(dia - this.getUltimoDiaRegacao() >= 3.5){
            this.setUltimoDiaRegacao(dia);
            return true;
        }
        
        return false;
    }
    
    @Override
    public boolean adubar(int dia){
        if(dia - this.getUltimoDiaAdubacao() >= 30){
            this.setUltimoDiaAdubacao(dia);
            return true;
        }
        
        return false;
    }
    
}
