/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkfrontend;

import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class Tablet extends Dispositivo {
    
    @Override
    void ajustarTamanho(){
        double tamanho = 0;
        for(Elemento tag : this.tags){
            tag.setTamanho(tamanho);
        }
    }

    
}
