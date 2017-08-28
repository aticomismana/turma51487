/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao aviaoTam = new Aviao("SPACE", "GENERICO", "TAM", 100, 80);
        Aviao aviaoGol = new Aviao("RAPIDO", "AIRLINES", "GOL", 150, 120);
        Aviao aviaoAzul = new Aviao("VOADOR", "GENERICO", "AZUL", 300, 280);
        
        Random codigo = new Random();
        // letra A
        
        Aeroporto guarulhos = new Aeroporto(codigo.nextInt(), "GUARULHOS - SP");
        Aeroporto congonhas = new Aeroporto(codigo.nextInt(), "CONGONHAS - SP");
        Aeroporto salvador = new Aeroporto(codigo.nextInt(), "SALVADOR - BA");
        Aeroporto brasilia = new Aeroporto(codigo.nextInt(), "BRASILIA - BR");
        
        guarulhos.adicionaVoo(salvador, aviaoAzul);
        salvador.adicionaVoo(brasilia, aviaoGol);
        
        brasilia.adicionaVoo(congonhas, aviaoGol);
        congonhas.adicionaVoo(guarulhos, aviaoTam);
        
        salvador.adicionarAviaoNoPatio(aviaoGol);
        salvador.adicionarAviaoNoPatio(aviaoAzul);
        salvador.adicionarAviaoNoPatio(aviaoTam);

        
        if(salvador.verificaPatio("SPACE")){
            System.out.println("HÁ AVIÕES COM ESTE PREFIXO NO PATIO!");
        } else {
            System.out.println("NÃO HÁ AVIÕES COM ESTE PREFIXO NO PATIO!");
        }
        
        // letra c
        if(salvador.equals(salvador)){
            System.out.println("AEROPORTO IGUAL");
        } else {
            System.out.println("AEROPORTO DIFERENTE");
        }
        
        // letra b
        salvador.setStatus("INTERNACIONAL");

        if(salvador.verificaStatus()){
            System.out.println("ESTE AEROPORTO INTERNACIONAL");            
        } else {
            System.out.println("ESTE AEROPORTO NÃO É INTERNACIONAL");            
        }
        
        if(salvador.vooDireto(brasilia)){
            System.out.println("HÁ VOO DIRETO PARA ESTE DESTINO!");
        } else {
            System.out.println("NÃO HÁ VOO DIRETO PARA ESTE DESTINO!");            
        }
        
        if(salvador.verificaPatio("SPACE")){
            System.out.println("ESTE AVIÃO ESTÁ NO PATIO");            
        } else {
            System.out.println("NÃO ESTÁ NO PATIO!");            
        }
        
        ArrayList<Aeroporto> escala = Aeroporto.metodoDeChegada(salvador, congonhas);
        
        for(int i = 0; i < escala.size(); i++ ){
            System.out.println("\n " + escala.get(i).getNome());
        }
    }
    
}
