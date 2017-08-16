package model;

public class Desktop extends Dispositivo {

    @Override
    protected void renderizarArquivoHTML(ArquivoHTML arquivoHTML) {
        //TODO implementar
    }
    
    public Desktop(Tela tela, String tipo) {
        super(tela, tipo);
    }
    
}
