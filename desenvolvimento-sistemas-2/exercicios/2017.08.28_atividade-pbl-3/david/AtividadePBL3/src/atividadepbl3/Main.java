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
        int ciclo = 0, ciclo1 = 0, tipoFuncao;
        
        while(ciclo == 0){
            tipoFuncao = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n"
                                                                    + "1-Cadastrar Aeroporto\n"
                                                                    + "2-Cadastrar Aviao\n"
                                                                    + "3-Lista de Aeroportos"));
            
            switch(tipoFuncao){
                case 0:
                    break;
                case 1:
                    while(ciclo1 == 0){
                        String nomeA = JOptionPane.showInputDialog("Digite o nome do Aeroporto");
                        String codigoA = JOptionPane.showInputDialog("Digite o código do Aeroporto");
                        Aeroporto A = new Aeroporto(codigoA, nomeA);
                        int cad = JOptionPane.showConfirmDialog(null, "Deseja selecionar o Status do Aeroporto?");
                        if(cad == 0){
                            String status = JOptionPane.showInputDialog("Informe se o Aeroporto " + A.getNome() + " é Nacional ou Internacional");
                            A.setStatus(status);
                        }
                        Aeroporto.setAeroporto(A);
                        ciclo1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Aeroporto?");
                    }
                    ciclo1 = 0;
                    break;
                case 2:
                    while(ciclo1 == 0){ 
                        String prefixoA = JOptionPane.showInputDialog("Digite o Prefixo do Avião");
                        String modeloA = JOptionPane.showInputDialog("Digite o Modelo do Avião");
                        String fabricanteA = JOptionPane.showInputDialog("Digite o Fabricante do Avião");
                        int assentosA = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de"
                                                                               + " Assentos do Avião"));

                        int assentosOA = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de"
                                                                                + " Assentos oculpados do Avião"));
                        Aviao Av = new Aviao(prefixoA, modeloA, fabricanteA, assentosA, assentosOA);
                        Aviao.setAviao(Av);
                        ciclo1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro avião?");
                        }
                    ciclo1 = 0;
                break;
                
                case 3:
                   JOptionPane.showMessageDialog(null, "Lista de Aeroportos: ");
                   for(int i = 0; i < Aeroporto.getListaAeroporto().size(); i++){
                       System.out.println(i+ " - " + Aeroporto.getAeroporto(i).getCodigo() + " - " 
                                                   + Aeroporto.getAeroporto(i).getNome());
                   }
                   int selecionarAeroporto = Integer.parseInt(JOptionPane.showInputDialog("Selecione um Aeroporto"));
                   System.out.println("Aeroporto selecionado: " + 
                                       Aeroporto.getAeroporto(selecionarAeroporto).getNome() + ".");
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
                            System.out.println("O Aeroporto " + Aeroporto.getAeroporto(selecionarAeroporto).getNome()
                                             + " é " + Aeroporto.getAeroporto(selecionarAeroporto).getStatus());                
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Lista de Aviões: " );
                            for(int i = 0; i < Aviao.getListaAviao().size(); i ++){
                                System.out.println(i + "- " + Aviao.getAviao(i).getPrefixo() + "-" 
                                                            + Aviao.getAviao(i).getModelo() + "\n");
                            }
                            int selecionarAviao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Avião "
                                                                                      + "para por no pátio"));
                            Aeroporto.adicionarPatio(Aviao.getAviao(selecionarAviao));
                            //Aeroporto.getAeroporto(selecionarAeroporto).adicionarPatio(Aviao.getAviao(selecionarAviao));
                            Aviao.removeAviao(Aviao.getAviao(selecionarAviao));
                            JOptionPane.showMessageDialog(null, "Avião " 
                                                        + Aviao.getAviao(selecionarAviao).getPrefixo() + "-"
                                                        + Aviao.getAviao(selecionarAviao).getModelo()
                                                        + "adicionado ao pátio do Aeroporto "
                                                        + Aeroporto.getAeroporto(selecionarAeroporto).getCodigo() + "-"
                                                        + Aeroporto.getAeroporto(selecionarAeroporto).getNome());
                            break;
                        case 3:
                            int vooS = 0, vooC = 0;
                            int tipoVoo = Integer.parseInt(JOptionPane.showInputDialog("1- Vôos saindo\n"
                                                                                     + "2- Vôos chegando "));
                            switch(tipoVoo){
                                case 1:
                                    while(vooS == 0){
                                        JOptionPane.showMessageDialog(null, "Lista de Aviões: " );
                                        for(int i = 0; i < Aviao.getListaAviao().size(); i ++){
                                            System.out.println(i + "- " + Aviao.getAviao(i).getPrefixo() + "-" 
                                                                 + Aviao.getAviao(i).getModelo() + "\n");
                                        }
                                        int selecionarAviaoPatio = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Avião para o voo"));
                                        Aviao aviao = Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio);
                                        Aeroporto aeroportoSaida = Aeroporto.getAeroporto(selecionarAeroporto);
                                        System.out.println("O Avião escolhido foi " + Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio).getPrefixo()
                                                                              + "-" + Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio).getModelo());
                                        JOptionPane.showMessageDialog(null, "Lista de Aeroportos");
                                        for(int i = 0; i < Aeroporto.getListaAeroporto().size(); i++){
                                            System.out.println(i + "- " + Aeroporto.getAeroporto(i).getCodigo() + "-" 
                                                                 + Aeroporto.getAeroporto(i).getNome() + "\n");
                                        }
                                        int selecionarAeroportoChegada = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Aeroporto de chegada ( Não escolha o mesmo da saída)"));
                                        Aeroporto aeroportoChegada = Aeroporto.getAeroporto(selecionarAeroportoChegada);
                                        System.out.println("O Aeroporto escolhido foi " + Aeroporto.getAeroporto(selecionarAeroportoChegada).getCodigo()
                                                                                  + "-" + Aeroporto.getAeroporto(selecionarAeroportoChegada).getNome());
                                        Voo voo = new Voo(aeroportoChegada, aeroportoSaida, aviao);
                                        Aeroporto.getAeroporto(selecionarAeroporto).setChegadaVoo(voo);
                                        Aeroporto.removerAviaoPatio(Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio));
                                        vooS =JOptionPane.showConfirmDialog(null, "Deseja criar outro Voo?");
                                    }
                                    break;
                                case 2:
                                    while(vooC == 0){
                                        JOptionPane.showMessageDialog(null, "Lista de Aviões: " );
                                        for(int i = 0; i < Aviao.getListaAviao().size(); i ++){
                                            System.out.println(i + "- " + Aviao.getAviao(i).getPrefixo() + "-" 
                                                                 + Aviao.getAviao(i).getModelo() + "\n");
                                        }
                                        int selecionarAviaoPatio = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Avião para o voo"));
                                        Aviao aviao = Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio);
                                        Aeroporto aeroportoChegada = Aeroporto.getAeroporto(selecionarAeroporto);
                                        System.out.println("O Avião escolhido foi " + Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio).getPrefixo()
                                                                              + "-" + Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio).getModelo());
                                        JOptionPane.showMessageDialog(null, "Lista de Aeroportos");
                                        for(int i = 0; i < Aeroporto.getListaAeroporto().size(); i++){
                                            System.out.println(i + "- " + Aeroporto.getAeroporto(i).getCodigo() + "-" 
                                                                 + Aeroporto.getAeroporto(i).getNome() + "\n");
                                        }
                                        int selecionarAeroportoSaida = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Aeroporto de saída ( Não escolha o mesmo da chegada)"));
                                        Aeroporto aeroportoSaida = Aeroporto.getAeroporto(selecionarAeroportoSaida);
                                        System.out.println("O Aeroporto escolhido foi " + Aeroporto.getAeroporto(selecionarAeroportoSaida).getCodigo()
                                                                                  + "-" + Aeroporto.getAeroporto(selecionarAeroportoSaida).getNome());
                                        Voo voo = new Voo(aeroportoChegada, aeroportoSaida, aviao);
                                        Aeroporto.getAeroporto(selecionarAeroporto).setSaidaVoo(voo);
                                        Aeroporto.removerAviaoPatio(Aeroporto.getAeroporto(selecionarAeroporto).getAviaoPatio(selecionarAviaoPatio));
                                        vooC = JOptionPane.showConfirmDialog(null, "Deseja criar outro Voo?");
                                    }
                                    break;
                            }
                            break;
                        case 4:
                            if(Aeroporto.getAeroporto(selecionarAeroporto).verificaIgualdade(Aeroporto.getAeroporto(selecionarAeroporto)) == false){
                                System.out.println("Aeroporto" + Aeroporto.getAeroporto(selecionarAeroporto).getCodigo() + "-" 
                                                               + Aeroporto.getAeroporto(selecionarAeroporto).getNome() 
                                                               + " não é igual a nenhum outro já cadastrado");
                            }else{
                                System.out.println("Aeroporto" + Aeroporto.getAeroporto(selecionarAeroporto).getCodigo() + "-" 
                                                               + Aeroporto.getAeroporto(selecionarAeroporto).getNome() 
                                                               + " é igual a outro já cadastrado");
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Lista de Aviões: " );
                            for(int i = 0; i < Aviao.getListaAviao().size(); i ++){
                                 System.out.println(i + "- " + Aviao.getAviao(i).getPrefixo() + "-" 
                                                             + Aviao.getAviao(i).getModelo() + "\n");
                            }
                            int selecionarChecagemAviaoPatio = Integer.parseInt(JOptionPane.showInputDialog("Qual avião deseja checar?"));
                            if(Aeroporto.verificarPatio(Aviao.getAviao(selecionarChecagemAviaoPatio)) == false){
                                System.out.println( "O aviao " + Aviao.getAviao(selecionarChecagemAviaoPatio).getPrefixo() + "-" 
                                                               + Aviao.getAviao(selecionarChecagemAviaoPatio).getModelo() 
                                                               + " não está no pátio");
                            }else{
                                System.out.println( "O aviao " + Aviao.getAviao(selecionarChecagemAviaoPatio).getPrefixo() + "-" 
                                                               + Aviao.getAviao(selecionarChecagemAviaoPatio).getModelo() 
                                                               + " está no pátio");
                            }
                            break;
                        case 6:
                            for(int i = 0; i < Aeroporto.getAeroporto(selecionarAeroporto).getListaSaidaVoo().size(); i++){
                                System.out.println("Avião do Voo -->" + Aeroporto.getAeroporto(selecionarAeroporto).getSaidaVoo(i).getAviao().getPrefixo()
                                                          + " - " + Aeroporto.getAeroporto(selecionarAeroporto).getSaidaVoo(i).getAviao().getModelo());
                                System.out.println("Destino do Voo --> " + Aeroporto.getAeroporto(selecionarAeroporto).getSaidaVoo(i).getDestino().getNome());
                            }
                            break;
                        case 7:
                            for(int i = 0; i < Aeroporto.getAeroporto(selecionarAeroporto).getListaChegadaVoo().size(); i++){
                                System.out.println("Avião do Voo -->" + Aeroporto.getAeroporto(selecionarAeroporto).getChegadaVoo(i).getAviao().getPrefixo()
                                                          + " - " + Aeroporto.getAeroporto(selecionarAeroporto).getChegadaVoo(i).getAviao().getModelo());
                                System.out.println("Destino do Voo --> " + Aeroporto.getAeroporto(selecionarAeroporto).getChegadaVoo(i).getDestino().getNome());
                            }
                            break;
                   }
                   break;
            }
        }
    }    
}
 