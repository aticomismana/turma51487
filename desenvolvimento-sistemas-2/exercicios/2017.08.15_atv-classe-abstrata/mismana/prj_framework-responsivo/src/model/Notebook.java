package model;

public class Notebook extends Dispositivo {
    
    @Override
    protected void renderizarArquivoHTML(ArquivoHTML arquivoHTML) {
        //TODO implementar
    }
    
    public Notebook(Tela tela, String tipo) {
        super(tela, tipo);
    }
    
}
