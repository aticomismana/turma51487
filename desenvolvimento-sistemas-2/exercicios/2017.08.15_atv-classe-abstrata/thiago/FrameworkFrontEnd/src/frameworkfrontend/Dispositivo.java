/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkfrontend;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public abstract class Dispositivo {
    private double tamanhoDaTela;
    ArrayList< Elemento > tags = new ArrayList();
    
    abstract void ajustarTamanho();
    
    void adicionarTag(Elemento tag){
       tags.add(tag);
    }
    
    ArrayList visualizarConteudo(){
        return tags;
    }
    
}
