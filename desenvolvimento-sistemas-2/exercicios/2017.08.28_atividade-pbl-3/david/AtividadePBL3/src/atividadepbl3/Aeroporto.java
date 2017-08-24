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
    private String codigo;
    private String nome;
    private String status = "No status";
    private ArrayList<Voo> vooOrigem = new ArrayList<>();
    private ArrayList<Voo> vooDestino = new ArrayList<>();
    private static ArrayList<Aviao> aviao = new ArrayList<>();
    private static ArrayList<Aeroporto> aeroposto = new ArrayList<>();
            
    public Aeroporto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }    
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public static void setAeroporto(Aeroporto aeroporto){
        aeroposto.add(aeroporto);
    }
    public void setSaidaVoo(Voo voo){
        vooOrigem.add(voo);
    }
    public Voo getSaidaVoo(int i){
        return vooOrigem.get(i);
    }
    public ArrayList getListaSaidaVoo(){
        return vooOrigem;
    }
    public void setChegadaVoo(Voo voo){
        vooDestino.add(voo);
    }
    public Voo getChegadaVoo(int i){
        return vooDestino.get(i);
    }
    public ArrayList getListaChegadaVoo(){
        return vooDestino;
    }
    //Adiciona avião ao patio do aeroporto
    public static boolean adicionarPatio(Aviao aviao){
        if(Aeroporto.aviao.size() <100){            
            Aeroporto.aviao.add(aviao);
            return true;
        }else{
            return false;
        }
    }
    //Verifica se o avião está na lista de aviões do patio
    public static boolean verificarPatio(Aviao aviao){
        boolean aux = false;
        int i;
        for(i = 0; i < Aeroporto.aviao.size(); i++){
            if(Aeroporto.aviao.get(i).getPrefixo().equals(aviao.getPrefixo())){
                return true;
            }
        }
        return aux;
    }
    //Remove avião do patio
    public static void removerAviaoPatio(Aviao avia){
        aviao.remove(avia);
    }
    //Retorna os indices dos aviões
    public static ArrayList getNumAviaoPatio(){
        return aviao;
    }
    //Pega uma Avião que está no pátio de determinado Aeroporto
    public Aviao getAviaoPatio(int i){
        return aviao.get(i);
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
    //Pega os indices dos Aeroportos
    public static ArrayList getListaAeroporto(){
        return aeroposto;
    }
    //Pega os dados dos Aeroportos
    public static Aeroporto getAeroporto(int i){
        return aeroposto.get(i);
    }
}