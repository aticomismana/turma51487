package model;

public class Paragrafo extends ItemConteudo {
    
    public Paragrafo(String tipo, Tamanho tamanho, Cor cor, String valor) {
        super(tipo, tamanho, cor, valor);
    }

    @Override
    public boolean redimensionar(Tamanho tamanhoTelaDispositivo, Double porcentagem) {
        throw new UnsupportedOperationException("Not supported yet.");
        //TODO implementar
    }
    
}
