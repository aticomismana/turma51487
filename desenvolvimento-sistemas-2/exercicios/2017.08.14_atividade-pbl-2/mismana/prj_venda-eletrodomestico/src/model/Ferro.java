package model;

public class Ferro extends Eletrodomestico {
    
    public Ferro(String marca, double preco, int voltagem) {
        super(marca,preco,voltagem);
    }
    
    @Override
    public boolean validarVoltagem(int voltagem){
        return (super.validarVoltagem(voltagem) || voltagem==5);
    }
    
    @Override
    public Double calcularDesconto(int mes){
        if(mes==5) {
            return super.preco*0.15;
        }
        return 0.00;
    }
}