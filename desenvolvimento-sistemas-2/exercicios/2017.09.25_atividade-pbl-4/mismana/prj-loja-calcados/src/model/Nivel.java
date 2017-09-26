package model;

public class Nivel {
    private int codigo;
    private String nome;

    public Nivel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}