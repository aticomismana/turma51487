/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl3;

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
    static int qtdAviao;
    
    public Aviao(String prefixo, String modelo, String fabricante){
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        qtdAviao ++;
    }
    
    public String getPrefixo(){
        return this.prefixo;
    }   
    public int getQtdAviao(){
        return Aviao.qtdAviao;
    }
}
