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
public class Voo {
    protected Aeroporto destino;
    protected Aeroporto saida;
    protected Aviao aviao;
    
    
    public Voo(Aeroporto destino, Aeroporto saida, Aviao aviao){
        this.destino = destino;
        this.saida = saida;
        this.aviao = aviao;
    }
    
//    public boolean verificaPouso(String prefixo, int qtdAviao){
//        boolean aux = false;
//        int i;
//        for(i = 0; i < qtdAviao; i++){
//            if(aviaoPatio.equals(prefixo)){
//                
//            }
//        }
//        
//        return aux;
//    }
}
