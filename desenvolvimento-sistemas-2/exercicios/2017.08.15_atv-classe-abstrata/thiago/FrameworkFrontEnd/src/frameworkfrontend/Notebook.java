/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkfrontend;

/**
 *
 * @author Aluno
 */
public class Notebook extends Dispositivo {
    
    @Override
    void ajustarTamanho(){
        double tamanho = 0;
        for(Elemento tag : this.tags){
            tamanho += tag.getTamanho() - 1.00;
            tag.setTamanho(tamanho);
        }
    }

    
}
