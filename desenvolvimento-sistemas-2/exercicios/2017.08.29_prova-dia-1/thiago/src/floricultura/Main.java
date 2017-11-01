/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao tipo da planta\n"
            + "1 - Orquidea\n"
            + "2 - Azaleia\n"
            + "3 - Violeta\n"));
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da planta"));
        
        int tempoDaPlanta = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo tem a planta em dias"));

        int diaRegacao = Integer.parseInt(JOptionPane.showInputDialog("Dia que a planta foi regada"));
        
        int vaso = Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao tipo do vaso\n"
                + "1 - Barro\n"
                + "2 - Plástico"));
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente ao tamanho do vaso\n"
                + "1 - Pequeno\n"
                + "2 - Medio\n"
                + "3 - Grande\n"));
        
        if(vaso == 0 || vaso > 2 ||tamanho == 0 || tamanho > 3){
            JOptionPane.showMessageDialog(null, "Por favor preencha as informações corretamente!");
        } else {
            double preco = 0;
            int escolherAdubar;
            int escolherRegar;
            switch(tipo){
                case 1:
                    Orquidea orquidea = new Orquidea(diaRegacao);
                    orquidea.setDiaDeExistencia(tempoDaPlanta);
                    orquidea.setCodigo(codigo);
                    preco = orquidea.getPreco();
                    escolherRegar = Integer.parseInt(JOptionPane.showInputDialog("Deseja regar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherRegar == 1){
                        if(orquidea.regar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi regada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de regar");
                        }
                    }
                    
                    escolherAdubar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adubar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherAdubar == 1){
                        if(orquidea.adubar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi adubada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de adubação");
                        }
                    }
                    
                    break;
                case 2:
                    Azaleia azaleia = new Azaleia(diaRegacao);
                    azaleia.setDiaDeExistencia(tempoDaPlanta);
                    azaleia.setCodigo(codigo);
                    preco = azaleia.getPreco();
                    escolherRegar = Integer.parseInt(JOptionPane.showInputDialog("Deseja regar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherRegar == 1){
                        if(azaleia.regar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi regada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de regar");
                        }
                    }
                    
                    escolherAdubar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adubar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherAdubar == 1){
                        if(azaleia.adubar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi adubada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de adubação");
                        }
                    }
                    
                    break;
                case 3:
                    Violeta violeta = new Violeta(diaRegacao);
                    violeta.setDiaDeExistencia(tempoDaPlanta);
                    violeta.setCodigo(codigo);
                    preco = violeta.getPreco();
                    escolherRegar = Integer.parseInt(JOptionPane.showInputDialog("Deseja regar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherRegar == 1){
                        if(violeta.regar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi regada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de regar");
                        }
                    }
                    
                    escolherAdubar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adubar a planbta ?\n"
                        + "1 - SIM\n"
                        + "2 - NÃO"));
                    if(escolherAdubar == 1){
                        if(violeta.adubar(tempoDaPlanta)){
                            JOptionPane.showMessageDialog(null, "A planta foi adubada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta planta não está no periodo de adubação");
                        }
                    }
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "A planta informada não tem na floricultura");
            }

            Vaso meuVaso = new Vaso();

            JOptionPane.showMessageDialog(null, "Total a pagar: " + (meuVaso.calculaPreco(vaso, tamanho) + preco) );
            
            JOptionPane.showMessageDialog(null, "Quantidade total de especies\n"
                    + "Azaleias: " + Azaleia.getQuantidadeEspecies() + " \n"
                    + "Orquidea: " + Orquidea.getQuantidadeEspecies() + " \n"
                    + "Violetas: " + Violeta.getQuantidadeEspecies() + " \n");


        }
    }  
}
