/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Orquidea extends Planta {
    private static ArrayList especiesCadastradas = new ArrayList();
    private double preco = 18.00; 
    
    public Orquidea(int ultimoDiaRegacao){
        super(ultimoDiaRegacao);
        especiesCadastradas.add(this);
    }
    
     public static int getQuantidadeEspecies(){
        return especiesCadastradas.size();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
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
        if(dia - this.getUltimoDiaAdubacao() >= 178){
            this.setUltimoDiaAdubacao(dia);
            return true;
        }
        
        return false;
    }

}
