package test;

import javax.swing.JOptionPane;
import model.*;

public class TesteEletrodomestico {
    public static void main (String [] args) {
        
        // dados da compra
        int codMes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do mês da compra: \n"));
        
        // dados do produto
        int codTipoProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto\n"
                + "(1. Batedeira, 2. Liquidificador ou 3. Ferro)\n: "));
        String marca = JOptionPane.showInputDialog("Informe a marca: ");
        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
        Integer voltagem = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem (5, 110 ou 220): "));

        Integer qtdHelices;
        
        Batedeira batedeira;
        Liquidificador liquidificador;
        Ferro ferro;
        
        Double quantidadeLitros = null;
        Double capacidadeLitrosPorSegundo = null;
        
        switch(codTipoProduto){
            case 3:
                // ferro
                ferro = new Ferro(marca, preco, voltagem);
                
                imprimirCupomFiscal(codMes, quantidadeLitros, capacidadeLitrosPorSegundo, ferro);
                break;
            case 1:
                // batedeira
                qtdHelices = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"
                        + "de hélices: "));
                
                batedeira = new Batedeira(marca, preco, voltagem, qtdHelices);
                
                quantidadeLitros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros: "));
                capacidadeLitrosPorSegundo = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade de litros por segundo: "));
                
                imprimirCupomFiscal(codMes, quantidadeLitros, capacidadeLitrosPorSegundo, batedeira);
                break;
            case 2:
                // liquidificador
                qtdHelices = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"
                        + " de hélices: "));
                String tampaCor = JOptionPane.showInputDialog("Informe a cor da tampa: ");
                String tampaDescricao = JOptionPane.showInputDialog("Informe a descrição da tampa: ");
                
                liquidificador = new Liquidificador(marca, preco, voltagem, qtdHelices, new Tampa(tampaCor, tampaDescricao) );
                
                quantidadeLitros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros: "));
                capacidadeLitrosPorSegundo = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade de litros por segundo: "));
                
                imprimirCupomFiscal(codMes, quantidadeLitros, capacidadeLitrosPorSegundo, liquidificador);
                break;
        }
    }
    
    public static void imprimirCupomFiscal(int codMes, Double quantidadeLitros, Double capacidadeLitrosPorSegundo, Eletrodomestico eletro) {
        boolean helicoidal = false;
        
        System.out.println("\n-> Mês da Compra: " + codMes + ".");
        
        System.out.println("-> Eletrodoméstico: ");
        System.out.print("Tipo: ");
        if(eletro instanceof Ferro){
            System.out.println("Ferro.");
        } else if (eletro instanceof Batedeira){
            System.out.println("Batedeira.");
            helicoidal = true;
        } else if (eletro instanceof Liquidificador){
            System.out.println("Liquidificador.");
            helicoidal = true;
        }
        
        System.out.println("Marca: " + eletro.getMarca() + ".");
        System.out.println("Preço: R$ " + eletro.getPreco() + ".");
        System.out.println("Voltagem: " + eletro.getVoltagem()+ ".");
        
        Double desconto = eletro.calcularDesconto(codMes);
        System.out.println("-> Desconto: R$ " + desconto + ".");
        System.out.println("-> Valor final: R$ " + (eletro.getPreco()-desconto) + ".");
    
        if(helicoidal){

            if(eletro instanceof Batedeira){
                Batedeira batedeira = (Batedeira) eletro;
            
                // qtd helices
                System.out.println("-> Quantidade de Hélices: " + batedeira.getQtdHelices() + ".");
                // mediaLitros
                System.out.println("-> Quantidade média de litros que podem ser batidos por segundo: " + batedeira.calcularMediaLitros(quantidadeLitros,capacidadeLitrosPorSegundo) + ".");
                
            } else if (eletro instanceof Liquidificador){
                Liquidificador liquidificador = (Liquidificador) eletro;
                
                // qtd helices
                System.out.println("-> Quantidade de Hélices: " + liquidificador.getQtdHelices() + ".");
                //tampa
                System.out.println("-> Tampa: ");
                System.out.println("Cor: " + liquidificador.getTampa().getCor() + ".");
                System.out.println("Descição: " + liquidificador.getTampa().getDescricao() + ".");
                // mediaLitros
                System.out.println("-> Quantidade média de litros que podem ser batidos por segundo: " + liquidificador.calcularMediaLitros(quantidadeLitros, capacidadeLitrosPorSegundo) + ".");
            }
        } // fim if
    }
}
