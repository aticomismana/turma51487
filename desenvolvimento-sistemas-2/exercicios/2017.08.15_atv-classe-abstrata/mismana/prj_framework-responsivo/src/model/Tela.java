package model;

public class Tela {
    private final Tamanho tamanho;
    private final String formato;
    
    public Tela(Tamanho tamanho, String formato) {
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