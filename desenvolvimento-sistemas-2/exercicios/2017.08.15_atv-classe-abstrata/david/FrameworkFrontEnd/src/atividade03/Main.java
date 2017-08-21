/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipoDispositivo;
        int tipoTexto;
        int ciclo = 1;        
        int qtdArray;
        int i;
        String corAux;
        double tamAux;
        
        //d1.getTextos().get(1);
        
        while(ciclo == 1){
            tipoDispositivo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Desktop \n"
                                                                         + "Digite 2 para Celular \n"
                                                                         + "Digite 3 para Notebook \n"
                                                                         + "Digite 4 para Tablet"));
            switch(tipoDispositivo){
                case 1:
                    tipoTexto = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Links \n"
                                                                           + "Digite 2 para Listas \n"
                                                                           + "Digite 3 para Paragrafos"));
                    switch(tipoTexto){ 
                        case 1:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Links?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Link.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Link."));
                                Links lin = new Links(corAux, tamAux);

                                Desktop d1 = new Desktop(lin);
                                d1.textos.add(lin);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Desktop o tamanho do Link"
                                                                  + " foi convertido de: " + lin.tamanho
                                                                  + " Para: " + d1.converterTamanho(lin.tamanho));
                            }
                        break;

                        case 2:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Listas?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor da Lista.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho da Lista."));
                                Listas lis = new Listas(corAux, tamAux);

                                Desktop d1 = new Desktop(lis);
                                d1.textos.add(lis);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Desktop o tamanho da Lista"
                                                                  + " foi convertido de: " + lis.tamanho
                                                                  + " Para: " + d1.converterTamanho(lis.tamanho));   
                            }
                        break;
                        
                        case 3:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Paragrafos?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Paragrafo.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Paragrafo."));
                                Paragrafos par = new Paragrafos(corAux, tamAux);

                                Desktop d1 = new Desktop(par);
                                d1.textos.add(par);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Desktop o tamanho do Paragrafo"
                                                                  + " foi convertido de: " + par.tamanho
                                                                  + " Para: " + d1.converterTamanho(par.tamanho));   
                            }
                        break;
                    }
                break;
            }
            
            switch(tipoDispositivo){
                case 2:
                    tipoTexto = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Links \n"
                                                                           + "Digite 2 para Listas \n"
                                                                           + "Digite 3 para Paragrafos"));
                    switch(tipoTexto){ 
                        case 1:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Links?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Link.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Link."));
                                Links lin = new Links(corAux, tamAux);

                                Celular c1 = new Celular(lin);
                                c1.textos.add(lin);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Celular o tamanho do Link"
                                                                  + " foi convertido de: " + lin.tamanho
                                                                  + " Para: " + c1.converterTamanho(lin.tamanho));
                            }
                        break;

                        case 2:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Listas?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor da Lista.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho da Lista."));
                                Listas lis = new Listas(corAux, tamAux);

                                Celular c1 = new Celular(lis);
                                c1.textos.add(lis);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Celular o tamanho da Lista"
                                                                  + " foi convertido de: " + lis.tamanho
                                                                  + " Para: " + c1.converterTamanho(lis.tamanho));   
                            }
                        break;
                        
                        case 3:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Paragrafos?"));
                            
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Paragrafo.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Paragrafo."));
                                Paragrafos par = new Paragrafos(corAux, tamAux);

                                Celular c1 = new Celular(par);
                                c1.textos.add(par);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Celular o tamanho do Paragrafo"
                                                                  + " foi convertido de: " + par.tamanho
                                                                  + " Para: " + c1.converterTamanho(par.tamanho));   
                            }
                        break;
                    }
                break;
            }
            switch(tipoDispositivo){
                case 3:
                    tipoTexto = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Links \n"
                                                                           + "Digite 2 para Listas \n"
                                                                           + "Digite 3 para Paragrafos"));
                    switch(tipoTexto){ 
                        case 1:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Links?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Link.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Link."));
                                Links lin = new Links(corAux, tamAux);

                                Notebook n1 = new Notebook(lin);
                                n1.textos.add(lin);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Notebook o tamanho do Link"
                                                                  + " foi convertido de: " + lin.tamanho
                                                                  + " Para: " + n1.converterTamanho(lin.tamanho));
                            }
                        break;

                        case 2:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Listas?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor da Lista.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho da Lista."));
                                Listas lis = new Listas(corAux, tamAux);

                                Notebook n1 = new Notebook(lis);
                                n1.textos.add(lis);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Notebook o tamanho da Lista"
                                                                  + " foi convertido de: " + lis.tamanho
                                                                  + " Para: " + n1.converterTamanho(lis.tamanho));   
                            }
                        break;
                        
                        case 3:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Paragrafos?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Paragrafo.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Paragrafo."));
                                Paragrafos par = new Paragrafos(corAux, tamAux);

                                Notebook n1 = new Notebook(par);
                                n1.textos.add(par);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Notebook o tamanho do Paragrafo"
                                                                  + " foi convertido de: " + par.tamanho
                                                                  + " Para: " + n1.converterTamanho(par.tamanho));   
                            }
                        break;
                    }
                break;
            }
            switch(tipoDispositivo){
                case 4:
                    tipoTexto = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Links \n"
                                                                           + "Digite 2 para Listas \n"
                                                                           + "Digite 3 para Paragrafos"));
                    switch(tipoTexto){ 
                        case 1:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Links?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Link.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Link."));
                                Links lin = new Links(corAux, tamAux);

                                Tablet t1 = new Tablet(lin);
                                t1.textos.add(lin);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Tablet o tamanho do Link"
                                                                  + " foi convertido de: " + lin.tamanho
                                                                  + " Para: " + t1.converterTamanho(lin.tamanho));
                            }
                        break;

                        case 2:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Links?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor da Lista.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho da Lista."));
                                Listas lis = new Listas(corAux, tamAux);

                                Tablet t1 = new Tablet(lis);
                                t1.textos.add(lis);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Tablet o tamanho da Lista"
                                                                  + " foi convertido de: " + lis.tamanho
                                                                  + " Para: " + t1.converterTamanho(lis.tamanho));   
                            }
                        break;
                        
                        case 3:
                            qtdArray = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos Paragrafos?"));
                    
                            for(i = 0; i < qtdArray; i++){
                                corAux = JOptionPane.showInputDialog("Ditigite a cor do Paragrafo.");
                                tamAux =  Double.parseDouble(JOptionPane.showInputDialog("Ditigite o tamanho do Paragrafo."));
                                Paragrafos par = new Paragrafos(corAux, tamAux);

                                Tablet t1 = new Tablet(par);
                                t1.textos.add(par);
                                
                                JOptionPane.showMessageDialog(null, "Por se tratar de Tablet o tamanho do Paragrafo"
                                                                  + " foi convertido de: " + par.tamanho
                                                                  + " Para: " + t1.converterTamanho(par.tamanho));   
                            }
                        break;
                    }
                break;
            }
            ciclo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar a converter ou qualquer número para parar."));
        }
        JOptionPane.showMessageDialog(null, "Quantidade de textos nos Dispositivos é: "+ Html.qtdTextos +".");
    }            
}