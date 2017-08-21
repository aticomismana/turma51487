/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class Dispositivo {
    protected ArrayList<Html> textos;
    
    public Dispositivo(){
        textos = new ArrayList<Html>();
    }
    
    public ArrayList<Html> getTextos(){
        return this.textos;
    }
    public abstract double converterTamanho(double tamanhoElemento);
}
