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
public class Aviao {
    protected String prefixo;
    protected String modelo;
    protected String fabricante;
    protected int assentos;
    protected int assentosOculpados;
    protected ArrayList<Aviao> aviao;
    static int qtdAviao;
    
    public Aviao(String prefixo, String modelo, String fabricante, int assentos, int assentosOculpados){
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.assentos = assentos;
        this.assentosOculpados = assentosOculpados;
        aviao = new ArrayList<>();
        qtdAviao ++;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    public String getPrefixo(){
        return this.prefixo;
    }       
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public int getAssentos(){
        return this.assentos;
    }
    public void setAssentosOculpados(int assentosOculpados){
        this.assentosOculpados = assentosOculpados;
    }
    public int getAssentosOculpados(){
        return this.assentosOculpados;
    }
    public void setAviao(Aviao aviao){
        this.aviao.add(aviao);
    }
    public ArrayList<Aviao> getAviao(int i){
        return this.getAviao(i);
    }
    public int getQtdAviao(){
        return Aviao.qtdAviao;
    }
}
