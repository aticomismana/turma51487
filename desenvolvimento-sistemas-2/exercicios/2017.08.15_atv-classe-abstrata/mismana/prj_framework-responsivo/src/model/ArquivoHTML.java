package model;

import java.util.ArrayList;

public class ArquivoHTML {
    private final ArrayList<ItemConteudo> conteudo;
    private String nome;
    
    public Boolean adicionarConteudo(ItemConteudo conteudo) {
        // metodo add ja retorna um boolean
        return this.conteudo.add(conteudo);

        //this.conteudo.add(conteudo);
        //return true;
    }
    
    public ArrayList<ItemConteudo> getConteudo() {
        return this.conteudo;
    }
    
    public ArquivoHTML(String nome) {
        this.conteudo = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}