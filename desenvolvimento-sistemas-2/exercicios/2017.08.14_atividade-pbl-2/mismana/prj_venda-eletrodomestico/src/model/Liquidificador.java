package model;

public class Liquidificador extends Helicoidal {
    private Tampa tampa;
    
    public Liquidificador(String marca, double preco, int voltagem, int qtdHelices, Tampa tampa) {
        super(marca,preco,voltagem,qtdHelices);
        this.tampa=tampa;
    }
    
    @Override
    public Double calcularDesconto(int mes){
        if(mes==8) {
            return super.preco*0.1;
        }
        return 0.00;
    }
    
    @Override
    public double calcularMediaLitros(double quantidade, double capacidade){
        return quantidade/capacidade;
    }

    public Tampa getTampa() {
        return tampa;
    } 
}