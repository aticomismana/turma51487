package model;

public class Link extends ItemConteudo {
    
    public Link(String tipo, Tamanho tamanho, Cor cor, String valor) {
        super(tipo, tamanho, cor, valor);
    }

    @Override
    public boolean redimensionar(Tamanho tamanhoTelaDispositivo, Double porcentagem) {
        throw new UnsupportedOperationException("Not supported yet.");
        //TODO implementar
    }
    
}
