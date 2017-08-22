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
                    
                    Tamanho tamanhoExibicaoItem = itemConteudo.getTamanhoExibicaoAtual(); 
                    System.out.println("\t\t\t- Tamanho Exibição (Largura x Altura): "
                        + tamanhoExibicaoItem.getAltura() + " x " + tamanhoExibicaoItem.getLargura()
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
        Double porcentagemRedimensionamento = 1D;
        
        Double alturaTotalConteudos = 0D;      // nao retorna o valor, retorna o objeto
        Double larguraTotalConteudos = 0D;    // nao retorna o valor, retorna o objeto
        
        // itera os itens do conteudo do arquivo
        for(ItemConteudo itemConteudo : arquivoHTML.getConteudo()) {
            //Double alturaAtual = tamanhoConteudo.getAltura();
            alturaTotalConteudos += itemConteudo.getTamanho().getAltura();
            
            //Double larguraAtual = tamanhoConteudo.getLargura();
            larguraTotalConteudos += itemConteudo.getTamanho().getLargura();
        }
        
        System.out.println(""
                + "tamanhoConteudo:\taltura: "
                + alturaTotalConteudos
                + "\tlargura: "
                + larguraTotalConteudos
        );
        
        int qtdConteudosARedimensionar = arquivoHTML.getConteudo().size();
        
        // necessário para re-iniciar o loop
        int cicloCompletoDeConteudos = arquivoHTML.getConteudo().size();
        int contador=0;
        
        while( (alturaTotalConteudos > this.getTela().getTamanho().getAltura() &&
                larguraTotalConteudos > this.getTela().getTamanho().getLargura() ) &&
                qtdConteudosARedimensionar > 0) {
            System.out.println("alturaTotal: " + alturaTotalConteudos + "larguraTotal: " + larguraTotalConteudos);
            // renderizar objeto
            ItemConteudo itemConteudo = arquivoHTML.getConteudo().get(contador);
            Double alturaConteudoAtual = itemConteudo.getTamanho().getAltura();
            Double larguraConteudoAtual = itemConteudo.getTamanho().getLargura();
            
            //if (!arquivoHTML.getConteudo().get(contador).redimensionar(this.getTela().getTamanho(), porcentagemRedimensionamento)) {
            if(itemConteudo.redimensionar(this.getTela().getTamanho(), porcentagemRedimensionamento)) {
                alturaTotalConteudos -= alturaConteudoAtual*(porcentagemRedimensionamento/100);
                //tamanhoConteudo.setAltura(alturaTotalConteudos);      // nao precisa
                larguraTotalConteudos -= larguraConteudoAtual*(porcentagemRedimensionamento/100);
                //tamanhoConteudo.setLargura(larguraTotalConteudos);      // nao precisa
            } else {
                // se nao redimensionar, ou seja, tamanhoMinimo do conteudo ja atingido, subtrai no contador
                qtdConteudosARedimensionar--;
            }
            
            // incrementa contador de arquivos
            if(contador==cicloCompletoDeConteudos-1) {
                contador=0;
            } else {
                contador++;
            }
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