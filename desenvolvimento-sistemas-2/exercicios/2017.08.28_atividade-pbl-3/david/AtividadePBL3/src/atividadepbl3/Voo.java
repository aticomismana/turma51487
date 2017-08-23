package atividadepbl3;

public class Voo {
    protected Aeroporto destino;
    protected Aeroporto saida;
    protected Aviao aviao;
    
    
    public Voo(Aeroporto destino, Aeroporto saida, Aviao aviao){
        this.destino = destino;
        this.saida = saida;
        this.aviao = aviao;
    }
    
    public Aeroporto getDestino(){
        return this.destino;
    }
    public Aeroporto getSaida(){
        return this.saida;
    }
    public Aviao getAviao(){
        return this.aviao;
    }
}
