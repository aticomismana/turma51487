/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author aluno
 */
public class Aeroporto {
    private int codigo;
    private String nome;
    private String status = "NACIONAL";
    private ArrayList<Aviao> avioesPatio = new ArrayList<Aviao>();
    private ArrayList<Voo> voos = new ArrayList<Voo>();

    public Aeroporto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean verificaStatus(){
        return "INTERNACIONAL".equals(this.status);
    }
    
    public boolean equals(Aeroporto aeroporto){
        return aeroporto.codigo == this.codigo;
    }
    
    public boolean adicionarAviaoNoPatio(Aviao aviao){
        if(avioesPatio.size() < 100){
            avioesPatio.add(aviao);
            return true;
        }
        
        return false;
    }
    
    public void removerAviaoDoPatio(Aviao aviao){
        avioesPatio.remove(aviao);
    }
    
    public boolean adicionaVoo(Aeroporto aeroporto, Aviao aviao){
        if(voos.size()){
            Voo voo = new Voo(aeroporto, this, aviao);
            voos.add(voo);
            return true;
        }
        
        return false
    }

    public ArrayList<Voo> getVoos() {
        return voos;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Aviao> getAvioesPatio() {
        return avioesPatio;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
    public boolean verificaPatio(String prefixo){
        for(int i = 0; i < avioesPatio.size(); i++){
            if(prefixo.equals(avioesPatio.get(i).getPrefixo())){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean vooDireto(Aeroporto aeroporto){
        for(int i = 0; i < this.voos.size(); i++){
            if(this.voos.get(i).getDestino().getCodigo() == aeroporto.getCodigo()){
                return true; 
            }
        }
        return false;
    }
    
    public static ArrayList metodoDeChegada(Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino){
        ArrayList<Aeroporto> escala = new ArrayList<>();
        
        for(int i = 0; i < aeroportoOrigem.voos.size(); i++){
                
        }
        
        escala.add(aeroportoOrigem);

        return escala;
    } 
}
