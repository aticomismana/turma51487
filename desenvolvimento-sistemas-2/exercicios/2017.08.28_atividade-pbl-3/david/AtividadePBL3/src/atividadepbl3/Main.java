/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl3;

import javax.swing.JOptionPane;

/**
 *
 * @author davii
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        int ciclo = 1, ciclo1 = 1, tipoFuncao;
        
        while(ciclo == 1){
            tipoFuncao = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n"
                                                                    + "1-Cadastrar Aeroporto\n"
                                                                    + "2-Cadastrar Aviao\n"
                                                                    + "3-Lista de Aeroportos"));
            
            switch(tipoFuncao){
                case 0:
                    break;
                case 1:
                    while(ciclo1 == 1){
                        String nomeA = JOptionPane.showInputDialog("Digite o nome do Aeroporto");
                        String codigoA = JOptionPane.showInputDialog("Digite o código do Aeroporto");
                        Aeroporto A = new Aeroporto(codigoA, nomeA);
                        int cad = JOptionPane.showConfirmDialog(null, "Deseja selecionar o Status do Aeroporto?");
                        if(cad == 0){
                            A.status = JOptionPane.showInputDialog("Informe se o Aeroporto" + A.nome + " é Nacional ou Internacional");
                        }
                        Aeroporto.aeroposto.add(A);
                        ciclo1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Aeroporto?");
                    }
                    break;
                case 2:
                    while(ciclo1 == 1){ 
                        String prefixoA = JOptionPane.showInputDialog("Digite o Prefixo do Avião");
                        String modeloA = JOptionPane.showInputDialog("Digite o Modelo do Avião");
                        String fabricanteA = JOptionPane.showInputDialog("Digite o Fabricante do Avião");
                        int assentosA = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de"
                                                                               + "Assentos do Avião"));

                        int assentosOA = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de"
                                                                                + "Assentos oculpados do Avião"));
                        Aviao Av = new Aviao(prefixoA, modeloA, fabricanteA, assentosA, assentosOA);
                        Av.aviao.add(Av);
                        ciclo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se deseja cadastrar"
                                                                            + "outro Avião"));
                        }
                break;
                
                case 3:
                   JOptionPane.showMessageDialog(null, "Lista de Aeroportos: ");
                   for(int i = 0; i < Aeroporto.getListaAeroportos().size(); i++){
                       System.out.println(i+ " - " + Aeroporto.getAeroportos(i).codigo + " - " 
                                         + Aeroporto.getAeroportos(i).nome);
                   }
                   int selecionarA = Integer.parseInt(JOptionPane.showInputDialog("Selecione um Aeroporto"));
                   System.out.println("Aeroporto selecionado: " + 
                                       Aeroporto.getAeroportos(selecionarA).nome + ".");
                   int novasFuncoes = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n"
                                                                                 + "1-Verificar Internacionalidade\n"
                                                                                 + "2-Adicionar Avião ao pátio\n"
                                                                                 + "3-Adicionar Vôo\n"
                                                                                 + "4-Comparar Aeroportos\n"
                                                                                 + "5-Verificar Aviões no pátio\n"
                                                                                 + "6-Verificar vôos partindo\n"
                                                                                 + "7-Verificar vôos chegando\""));
                
                   switch(novasFuncoes){
                        case 0:
                            break;
                        case 1:
                            System.out.println("O avião " + Aeroporto.getAeroportos(selecionarA).nome 
                                             + " é " + Aeroporto.getAeroportos(selecionarA).status);                
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                   }
                   break;
            }
        }
    }    
}
 