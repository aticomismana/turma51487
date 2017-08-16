package model;

public class Tela {
    private final Tamanho tamanho;
    private final String formato;   //TODO arrumar diagrama
    
    public Tela(Tamanho tamanho, String formato) {      //TODO arrumar diagrama
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
    
    public String getFormato() {
        return formato;
    }
    
}