/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

/**
 *
 * @author aluno
 */
public class Voo {
    private Aeroporto destino;
    private Aeroporto origem;
    private Aviao aviao;

    public Voo(Aeroporto destino, Aeroporto origem, Aviao aviao){
        this.destino = destino;
        this.origem = origem;
        this.aviao = aviao;
    }
    
    public Aviao getAviao() {
        return aviao;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    
}
