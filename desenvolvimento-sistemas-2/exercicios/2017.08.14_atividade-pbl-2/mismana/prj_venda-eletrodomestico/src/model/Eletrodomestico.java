package model;

public abstract class Eletrodomestico {
    protected String marca;
    protected Double preco;
    private Integer voltagem;
    
    public Eletrodomestico(String marca, double preco, int voltagem){
        this.marca= marca;
        this.preco= preco;
        this.setVoltagem(voltagem);
    }
    
    public Eletrodomestico(String marca, int voltagem){
        this.marca= marca;
        this.setVoltagem(voltagem);
    }
    
    public abstract Double calcularDesconto(int mes);
    
    public boolean validarVoltagem(int voltagem){
        return (voltagem==110 || voltagem==220);
    }
    
    public void setVoltagem(int voltagem){
        if( this.validarVoltagem(voltagem) ){
            this.voltagem=voltagem;
        } else {
            this.voltagem=null;
        }
    }

    public String getMarca() {
        return marca;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getVoltagem() {
        return voltagem;
    }
}