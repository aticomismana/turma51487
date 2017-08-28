/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

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
        
        Aeroporto guarulhos = new Aeroporto(codigo.nextInt(), "GUARULHOS - SP");
        Aeroporto congonhas = new Aeroporto(codigo.nextInt(), "CONGONHAS - SP");
        Aeroporto salvador = new Aeroporto(codigo.nextInt(), "SALVADOR - BA");
        Aeroporto brasilia = new Aeroporto(codigo.nextInt(), "BRASILIA - BR");
        
        guarulhos.adicionaVoo(salvador, aviaoAzul);
        salvador.adicionaVoo(brasilia, aviaoGol);
        
        salvador.adicionarAviaoNoPatio(aviaoGol);
        salvador.adicionarAviaoNoPatio(aviaoAzul);
        salvador.adicionarAviaoNoPatio(aviaoTam);

        if(salvador.verificaPatio("SPACE")){
            System.out.println("HÁ AVIÕES COM ESTE PREFIXO NO PATIO!");
        } else {
            System.out.println("NÃO HÁ AVIÕES COM ESTE PREFIXO NO PATIO!");
        }
        
        if(salvador.vooDireto(brasilia)){
            System.out.println("HÁ VOO DIRETO PARA ESTE DESTINO!");
        } else {
            System.out.println("NÃO HÁ VOO DIRETO PARA ESTE DESTINO!");            
        }
    }
    
}
