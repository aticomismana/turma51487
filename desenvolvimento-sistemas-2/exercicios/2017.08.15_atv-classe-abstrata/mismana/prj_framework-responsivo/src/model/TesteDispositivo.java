package model;

import java.util.ArrayList;

public class TesteDispositivo {
    
    // cria lista de dispositivos
    public static ArrayList<Dispositivo> dispositivosLista = new ArrayList<Dispositivo>();
    
    public static void main(String args[]) {
        criarDispositivos();
        imprimirDispositivos();
        
        criarArquivoHTMLTeste();
        imprimirDispositivos();
        
        System.out.println("\n\n\n-> Lista de Dispositivos");
        exibirArquivoHTMLEmDispositivos();
    }
    
    public static void criarDispositivos() {
        
        // criação das telas
        //---------------------------------------------------------------------- // 1” (polegada) = 2,54cm
        // referencia:
        // 1: http://www.telasnardelli.com.br/telas-de-projecao-calculo-do-tamanho-da-tela
        // 2: https://www.tecmundo.com.br/samsung/72869-novos-tablets-samsung-ter-tela-formato-4-3.htm
        
        // tela desktop
        Tamanho tamanhoTelaDesktop = new Tamanho(37.41, 66.48);
        Tela telaDesktop = new Tela(tamanhoTelaDesktop, "16:9");
        // Formato Formato HDTV 16:9 - 76,2cm ou 30"
        // altura 37,41cm ou 14,73"
        // largura 66,48cm ou 26,17"
        
        // tela notebook
        Tamanho tamanhoTelaNotebook = new Tamanho(22.89, 37.67);
        Tela telaNotebook = new Tela(tamanhoTelaNotebook, "16:10");
        // Formato Wide Computer 16:10 - 43,18cm ou 17"
        // altura 22,89cm ou 9,01"
        // largura 37,67cm ou 14,83"
        
        // tela tablet
        Tamanho tamanhoTelaTablet = new Tamanho(9.85, 17.5);
        Tela telaTablet = new Tela(tamanhoTelaTablet, "16:9");
        // Formato HDTV 16:9 - 20,06cm ou 7,9" 
        // altura 9,85cm ou 3,88"
        // largura 17,5cm ou 6,89"
        
        // tela smartphone
        Tamanho tamanhoTelaSmartphone = new Tamanho(6.55, 8.73);
        Tela telaSmartphone = new Tela(tamanhoTelaSmartphone, "4:3");
        // Formato Vídeo 4:3 - 10,92cm ou 4,3"
        // altura 6,55cm ou 2,58"
        // largura 8,73cm ou 3,44"
        //----------------------------------------------------------------------
        
        
        // criação de dispositivos
        //----------------------------------------------------------------------
        Desktop desktop = new Desktop(telaDesktop, "Desktop");
        dispositivosLista.add(desktop);
        Notebook notebook = new Notebook(telaNotebook, "Notebook");
        dispositivosLista.add(notebook);
        Tablet tablet = new Tablet(telaTablet, "Tablet");
        dispositivosLista.add(tablet);
        Smartphone smartphone = new Smartphone(telaSmartphone, "Smartphone");
        dispositivosLista.add(smartphone);
        //----------------------------------------------------------------------    
    }
    
    public static void imprimirDispositivos() {
        // imprime lista de dispositivos
        //----------------------------------------------------------------------
        System.out.println("\n\n\n-> Lista de Dispositivos");
        for(int i = 0; i < dispositivosLista.size(); i++) {
            System.out.println("\n* Dispositivo " + (i+1) + ": ");
            System.out.println("------------------");
            System.out.println("- Tipo: " + dispositivosLista.get(i).getTipo());
            System.out.println("- Tela: ");
            System.out.println("\tFormato: " + dispositivosLista.get(i).getTela().getFormato());
            System.out.println("\tTamanho (Largura x Altura): "
                    + dispositivosLista.get(i).getTela().getTamanho().getAltura()
                    + " x "
                    + dispositivosLista.get(i).getTela().getTamanho().getLargura()
                    + " cm");
            System.out.println("- Arquivos: ");
            if(dispositivosLista.get(i).getArquivosHTML().size()==0) {
                System.out.println("\tNão há arquivos no dispositivo.");
            } else {
                for(int j = 0; j < dispositivosLista.get(i).getArquivosHTML().size(); j++) {
                    System.out.println("\tArquivo " + (j+1) + ": " + dispositivosLista.get(i).getArquivosHTML().get(j).getNome() );
                }
            }
        }
        //----------------------------------------------------------------------   
    }
    
    public static void criarArquivoHTMLTeste() {
        // cria arquivo html
        ArquivoHTML arquivoHTML = new ArquivoHTML("teste1.html");
        
        //cria conteudos e adiciona no html
        Tamanho tamanhoItem;
        Cor corItem;
        String valorItem;
        
        tamanhoItem = new Tamanho(800D, 600D);
        corItem = new Cor("Azul");
        valorItem = "Este é o paragráfo 1.";
        ItemConteudo paragrafo1 = new Paragrafo("Paragrafo", tamanhoItem, corItem, valorItem);
        arquivoHTML.adicionarConteudo(paragrafo1);
        
        tamanhoItem = new Tamanho(1024D, 768D);
        corItem = new Cor("Verde");
        valorItem = "Este é o Link 1: http://github.com";
        ItemConteudo link1 = new Link("Link", tamanhoItem, corItem, valorItem);
        arquivoHTML.adicionarConteudo(link1);

        tamanhoItem = new Tamanho(1366D, 768D);
        corItem = new Cor("Azul");
        valorItem = "Este é a Lista 1: Senai Cimatec, Senai Lapinha, Senai Dendezeiros";
        ItemConteudo lista1 = new Lista("Lista", tamanhoItem, corItem, valorItem);
        arquivoHTML.adicionarConteudo(lista1);
        
        
        // adiciona o mesmo arquivo html em todos os dispositivos
        //----------------------------------------------------------------------
        for(Dispositivo dispositivo : dispositivosLista) {
            dispositivo.getArquivosHTML().add(arquivoHTML);
        }
        //----------------------------------------------------------------------
        
    }
 
    public static void exibirArquivoHTMLEmDispositivos() {
        
        // itera os dispositivos
        for(Dispositivo dispositivo : dispositivosLista) {
            
            // itera os arquivos de cada dispositivo
            for(ArquivoHTML htmlCurrent : dispositivo.getArquivosHTML()) {
                dispositivo.exibirArquivoHTML(htmlCurrent);
            }
            
        }
    }
}