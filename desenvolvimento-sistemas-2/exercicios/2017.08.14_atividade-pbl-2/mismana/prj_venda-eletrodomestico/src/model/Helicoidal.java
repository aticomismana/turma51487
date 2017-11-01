package model;

public abstract class Helicoidal extends Eletrodomestico {
    private int qtdHelices;
    
    public Helicoidal(String marca, double preco, int voltagem, int qtdHelices) {
        super(marca,preco,voltagem);
        this.qtdHelices=qtdHelices;
    }
    
    public abstract double calcularMediaLitros(double quantidade, double capacidade);

    public int getQtdHelices() {
        return qtdHelices;
    }

    public void setQtdHelices(int qtdHelices) {
        this.qtdHelices = qtdHelices;
    }
}
