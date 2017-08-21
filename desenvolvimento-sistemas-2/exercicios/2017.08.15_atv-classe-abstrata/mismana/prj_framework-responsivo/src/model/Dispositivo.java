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
        // chama metodo de renderização
        this.renderizarArquivoHTML(arquivoHTML);
        
        // exibe (com renderizacao) o arquivo html de/em cada dispositivo
        System.out.println("\n* Dispositivo: ");
        System.out.println("------------------");
        System.out.println("- Tipo: " + this.getTipo());
        System.out.println("- Tela: ");
        System.out.println("\tFormato: " + this.getTela().getFormato());
        System.out.println("\tTamanho (Largura x Altura): "
                + this.getTela().getTamanho().getAltura()
                + " x "
                + this.getTela().getTamanho().getLargura()
                + " cm");
        System.out.println("- Arquivos: ");
        if(this.getArquivosHTML().size()==0) {
            System.out.println("\tNão há arquivos no dispositivo.");
        } else {
            for(int i = 0; i < this.getArquivosHTML().size(); i++) {
                System.out.println("\tArquivo " + (i+1) + ": " + this.getArquivosHTML().get(i).getNome() );
                
                int cont = 0;
                // itera os itens do conteudo do arquivo
                for(ItemConteudo itemConteudo : this.getArquivosHTML().get(i).getConteudo()) {
                    cont++;
                    System.out.println("\t\t ItemConteudo " + (cont) + ": ");
                    System.out.println("\t\t ------------------");
                    System.out.println("\t\t\t- Tipo: " + itemConteudo.getTipo());
                    System.out.println("\t\t\t- Cor: " + itemConteudo.getCor().getNome());

                    Tamanho tamanhoItem = itemConteudo.getTamanho(); 
                    System.out.println("\t\t\t- Tamanho (Largura x Altura): "
                        + tamanhoItem.getAltura() + " x " + tamanhoItem.getLargura()
                        + " cm"
                    );
                    
                    Tamanho tamanhoMinimoItem = itemConteudo.getTamanhoMinimo(
                            this.getTela().getTamanho().getAltura()
                            + ":"
                            + this.getTela().getTamanho().getLargura()
                    );
                    System.out.println("\t\t\t- Tamanho Mínimo (Largura x Altura): "
                        + tamanhoMinimoItem.getAltura() + " x " + tamanhoMinimoItem.getLargura()
                        + " cm"
                    );
                    
                    System.out.println("\t\t\t- Valor: ");
                    System.out.println("\t\t\t\t- " + itemConteudo.getValor() + "\n");
                }
            }
        }
        
    }

    //não foi possivel reproduzir o metodo como abstrato na modelagem proposta (diferente do escopo inicial)
    //protected abstract void renderizarArquivoHTML(ArquivoHTML arquivoHTML);
    
    //TODO URGENTE
    private void renderizarArquivoHTML(ArquivoHTML arquivoHTML) {      //TODO alter diagrama
        Double contAlturaOriginal = 0D;
        Double contLarguraOriginal = 0D;
        
        // itera os itens do conteudo do arquivo
        for(ItemConteudo itemConteudo : arquivoHTML.getConteudo()) {
            contAlturaOriginal += itemConteudo.getTamanho().getAltura();
            contLarguraOriginal += itemConteudo.getTamanho().getLargura();
        }
        
        if(contAlturaOriginal<=this.getTela().getTamanho().getAltura() &&
                contLarguraOriginal<=this.getTela().getTamanho().getLargura()) {
            return;
        } else {
            
        }
    }

    
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