/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

/**
 *
 * @author aluno
 */
public class Aviao {
    private String prefixo;
    private String modelo;
    private String nomeFabricante;
    private int qtdAssentosDisponiveis;
    private int qtdAssentosOcupados;
    
    public Aviao(String prefixo, String modelo, String nomeFabricante, int qtdAssentosDisponiveis, int qtdAssentosOcupados){
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.nomeFabricante = nomeFabricante;
        this.qtdAssentosDisponiveis = qtdAssentosDisponiveis;
        this.qtdAssentosOcupados = qtdAssentosOcupados;

    }

    public String getModelo() {
        return modelo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public int getQtdAssentosDisponiveis() {
        return qtdAssentosDisponiveis;
    }

    public int getQtdAssentosOcupados() {
        return qtdAssentosOcupados;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public void setQtdAssentosDisponiveis(int qtdAssentosDisponiveis) {
        this.qtdAssentosDisponiveis = qtdAssentosDisponiveis;
    }

    public void setQtdAssentosOcupados(int qtdAssentosOcupados) {
        this.qtdAssentosOcupados = qtdAssentosOcupados;
    }
        
}
