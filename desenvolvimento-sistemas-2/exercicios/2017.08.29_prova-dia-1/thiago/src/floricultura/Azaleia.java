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
public class Azaleia extends Planta{
    private static ArrayList especiesCadastradas = new ArrayList();
    private double preco = 10.00; 
    
    public static int getQuantidadeEspecies(){
        return especiesCadastradas.size();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
   
    public Azaleia(int ultimoDiaRegacao){
        super(ultimoDiaRegacao);
        especiesCadastradas.add(this);
    }
     
    @Override
    public boolean regar(int dia){
        if(dia - this.getUltimoDiaRegacao() > 1){
            this.setUltimoDiaRegacao(dia);
            return true;
        }
        
        return false;
    }
    
    @Override
    public boolean adubar(int dia){
        if(dia - this.getUltimoDiaAdubacao() >= 90){
            this.setUltimoDiaAdubacao(dia);
            return true;
        }
        
        return false;
    }
}
