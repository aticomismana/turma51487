package model;

import java.util.ArrayList;

public class ArquivoHTML {
    private final ArrayList<Conteudo> conteudos;
    private String nome;
    
    public Boolean adicionarConteudo(Conteudo conteudo) {       //TODO alterar diagrama
        this.conteudos.add(conteudo);
        return true;    //TODO o add ja retorna true??
    }
    
    public ArrayList<Conteudo> getConteudos() {     //TODO alterar diagrama
        return this.conteudos;
    }
    
    public ArquivoHTML(String nome) {
        this.conteudos = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
  
}