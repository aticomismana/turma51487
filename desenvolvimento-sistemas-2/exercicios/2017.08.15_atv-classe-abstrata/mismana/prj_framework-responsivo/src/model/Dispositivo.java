package model;

import java.util.ArrayList;

public abstract class Dispositivo {
    private Tela tela;
    private ArrayList<ArquivoHTML> arquivosHTML;    //TODO alter diagrama
    private String tipo;

    protected void adicionarArquivoHTML(ArquivoHTML arquivoHTML){ //TODO alter diagrama
        this.arquivosHTML.add(arquivoHTML);
    }
    
    public void exibirArquivoHTML(ArquivoHTML arquivoHTML){ //TODO alter diagrama
        
    }
    
    protected abstract void renderizarArquivoHTML(ArquivoHTML arquivoHTML);   //TODO alter diagrama
    
    public Dispositivo(Tela tela, String tipo){
        this.arquivosHTML = new ArrayList<>();
        this.tela = tela;
        this.tipo = tipo;
    }

    public Tela getTela() {
        return tela;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<ArquivoHTML> getArquivosHTML() {
        return arquivosHTML;
    }

}