package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class ItemConteudo {
    private final String tipo;
    private Tamanho tamanho;
    private Map<String, Tamanho> tamanhoMinimo;             // <"TelaAltura:TelaLargura", Tamanho>
    private Map<String, Tamanho> tamanhoRedimensionado;     // <"TelaAltura:TelaLargura", Tamanho>
    private Cor cor;       //TODO alterar diagrama
    private String valor;

    public String getTipo() {
        return tipo;
    }
    
    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Tamanho getTamanhoMinimo(String key) {
        Tamanho tamanhoMinimo = this.tamanhoMinimo.get(key);
        if(tamanhoMinimo!=null) {
            return tamanhoMinimo;
        } else {
            this.calcularTamanhoMinimo();
            return this.getTamanhoMinimo(key);
            //TODO erro grave, se nao existir no metodo da construcao do tamanho minimo, o tamanho de tela,
            // entrara num loop infinito
        }
    }
    
    public void calcularTamanhoMinimo() {
        //TODO implementar iterador por enum de tamanhos de telas...??
        
//        for(DispositivoEnum dispositivoEnum : DispositivoEnum.getDispositivoEnumList()) {
//            if(dispositivoEnum==DispositivoEnum.DESKTOP) {
//                
//            } else if(dispositivoEnum==DispositivoEnum.NOTEBOOK) {
//                
//            } else if(dispositivoEnum==DispositivoEnum.TABLET) {
//                
//            } else if(dispositivoEnum==DispositivoEnum.SMARTPHONE) {
//                
//            }
//        }

        // mockando POG
        ArrayList<Tamanho> tamanhoTelaLista = new ArrayList<Tamanho>();
        Tamanho tamanhoTelaDesktop = new Tamanho(37.41, 66.48);
        Tamanho tamanhoTelaNotebook = new Tamanho(22.89, 37.67);
        Tamanho tamanhoTelaTablet = new Tamanho(9.85, 17.5);
        Tamanho tamanhoTelaSmartphone = new Tamanho(6.55, 8.73);
        tamanhoTelaLista.add(tamanhoTelaDesktop);
        tamanhoTelaLista.add(tamanhoTelaNotebook);
        tamanhoTelaLista.add(tamanhoTelaTablet);
        tamanhoTelaLista.add(tamanhoTelaSmartphone);
        
        for(Tamanho tamanhoTela : tamanhoTelaLista) {
            // get altura e largura da tela
            Double altura = tamanhoTela.getAltura();
            Double largura = tamanhoTela.getLargura();
            
            // constroi key com altura e largura da tela
            String key = altura + ":" + largura;
            
            // cria tamanho Minimo usando percentual randomico
            Random random = new Random();
            int nPercentualAleatorio = random.nextInt(100);
            
            Tamanho tamanhoMinimoItem = new Tamanho(
                    altura *= nPercentualAleatorio,
                    largura *= nPercentualAleatorio
            );
            
            // adiciona no mapa o tamanhoMinimo pra aquela tamanho de tela (key)
            this.tamanhoMinimo.put(key, tamanhoMinimoItem);
        }   
    }
    
    public Tamanho getTamanhoRedimensionado(String key) {   //TODO URGENTE
        Tamanho tamanhoRedimensionado = this.tamanhoRedimensionado.get(key);
        if(tamanhoRedimensionado!=null) {
            return tamanhoRedimensionado;
        } else {
            this.calcularTamanhoRedimensionado();
            return this.getTamanhoRedimensionado(key);
            //TODO erro grave, se nao existir no metodo da construcao do tamanho minimo, o tamanho de tela,
            // entrara num loop infinito
        }
    }
   
    private Tamanho calcularTamanhoRedimensionado() {       //TODO URGENTE
        return null;
    }
    
    public ItemConteudo(String tipo, Tamanho tamanho, Cor cor, String valor) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
        
        tamanhoMinimo = new HashMap<String,Tamanho>();
        tamanhoRedimensionado = new HashMap<String,Tamanho>();
    }


    
}