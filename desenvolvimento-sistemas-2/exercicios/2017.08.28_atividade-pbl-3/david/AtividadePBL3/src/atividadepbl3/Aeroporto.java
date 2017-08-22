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
    protected ArrayList<Voo> vooOrigem;
    protected ArrayList<Voo> vooDestino;
    protected ArrayList<Aviao> aviao;
    protected ArrayList<Aeroporto> aeroposto;
            
    public Aeroporto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        vooOrigem = new ArrayList<>();
        vooDestino = new ArrayList<>();
        aviao = new ArrayList<>();
        aeroposto = new ArrayList();
    }
        
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    //Adiciona avião ao patio do aeroporto
    public void adicionarPatio(Aviao aviao){
        this.aviao.add(aviao);
    }
    //Verifica se o avião está na lista de aviões do patio
    public boolean verificarPatio(Aviao aviao){
        boolean aux = false;
        int i;
        for(i = 0; i < this.aviao.size(); i++){
            if(this.aviao.get(i).prefixo.equals(aviao.prefixo)){
                return true;
            }
        }
        return aux;
    }
    //Verifica se existe voo com destino a o aeroporto sugerido
    public boolean verificaVoo(Aeroporto aeroporto){
        boolean aux = false;
        int i, j;
        for(i = 0; i < aeroposto.size(); i++){
            for(j = 0; j < vooDestino.size(); j++){              
                if(aeroposto.get(i).vooDestino.get(j).destino.nome.equals(aeroporto.nome)){
                    return true;
                }
            }
        }        
        return false;
    }
    //Verifica se existe aeroportos iguais
    public boolean verificaIgualdade(Aeroporto aeroporto){
        boolean aux = false;
        int i;
        for(i = 0; i < aeroposto.size(); i ++){
            if(aeroposto.get(i).codigo.equals(aeroporto.codigo)){
                return true;
            }        
        }
        return aux;
    }   
}