package model;

public class Batedeira extends Helicoidal {
    
    public Batedeira(String marca, double preco, int voltagem, int qtdHelices) {
        super(marca,preco,voltagem,qtdHelices);
    }
    
    @Override
    public Double calcularDesconto(int mes){
        if(mes==12) {
            return super.preco*0.2;
        }
        return 0.00;
    }
    
    @Override
    public double calcularMediaLitros(double quantidade, double capacidade){
        return this.getQtdHelices()*(quantidade/capacidade);
    }
}