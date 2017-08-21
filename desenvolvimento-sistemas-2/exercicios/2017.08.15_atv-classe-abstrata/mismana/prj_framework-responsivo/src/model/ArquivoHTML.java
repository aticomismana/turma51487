package model;

import java.util.ArrayList;

public class ArquivoHTML {
    private final ArrayList<ItemConteudo> conteudo;
    private String nome;
    
    public Boolean adicionarConteudo(ItemConteudo conteudo) {       //TODO alterar diagrama
        this.conteudo.add(conteudo);
        return true;    //TODO o add ja retorna true??
    }
    
    public ArrayList<ItemConteudo> getConteudo() {     //TODO alterar diagrama
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