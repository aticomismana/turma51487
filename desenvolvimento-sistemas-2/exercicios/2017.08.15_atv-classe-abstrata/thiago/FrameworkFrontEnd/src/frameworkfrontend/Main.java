/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkfrontend;


/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paragrafo p1 = new Paragrafo();
        p1.setCor("VERDE");
        p1.setTamanho(12);
        Link link = new Link();
        link.setCor("AZUL");
        link.setTamanho(10);
        Lista list = new Lista();
        list.setCor("VERMELHO");
        list.setTamanho(20);
        
        Celular celular = new Celular();
        celular.adicionarTag(p1);
        celular.adicionarTag(link);
        celular.adicionarTag(list);
        
        celular.ajustarTamanho();
        for (int i = 0; i < celular.visualizarConteudo().size(); ++i) {
            Elemento obj = (Elemento) celular.visualizarConteudo().get(i);
            System.out.println ("COR: " + obj.getCor() + " TAMANHO: " + obj.getTamanho());
        }
        
        Notebook notebook = new Notebook();
        notebook.adicionarTag(p1);
        notebook.adicionarTag(link);
        notebook.adicionarTag(list);
        
        notebook.ajustarTamanho();
        for (int i = 0; i < notebook.visualizarConteudo().size(); ++i) {
            Elemento obj = (Elemento) notebook.visualizarConteudo().get(i);
            System.out.println ("COR: " + obj.getCor() + " TAMANHO: " + obj.getTamanho());
        }
      }
    
}
