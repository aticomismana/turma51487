/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl3;

import java.util.ArrayList;

/**
 *
 * @author davii
 */
public class Aeroporto {
    protected String codigo;
    protected String nome;
    protected String status;
    protected ArrayList<Aeroporto> aeropostoPartir;
    protected ArrayList<Aeroporto> aeropostoChegar;
    protected ArrayList<Aviao> aviaoPatio;
    
    
    
    public Aeroporto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        aviaoPatio = new ArrayList<Aviao>();
    }
    
    public ArrayList<Aviao> getAviaoPatio(){
        return this.aviaoPatio;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
     public boolean verificaIgualdade(Aeroporto aeroposto){
        boolean aux = false;
        if(aeroposto.codigo.equals(this.codigo)){
            aux = true;
        }
        return aux;
    }
   
}
