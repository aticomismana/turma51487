/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author aluno
 */
public class Notebook extends Dispositivo{
    
    public Notebook(Html textos){
        textos.setTamanho(textos.tamanho);
        textos.setCor(textos.cor);
    }

    @Override
    public double converterTamanho(double tamanhoElemento){
        double tamTextos = tamanhoElemento *= 2.00;        
        return tamTextos;
    }
    
}
