package model;

public class Conteudo {
    private final String tipo;
    private Tamanho tamanho;
    private Cor cor;       //TODO alterar diagrama
    private String valor;

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Conteudo(String tipo, Tamanho tamanho, Cor cor, String valor) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
    }
    
}