/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

/**
 *
 * @author Thiago
 */
public abstract class Planta {
    private String especificacao;
    private int codigo;
    private Planta tipo;
    private int diaDeExistencia = 1;
    private int ultimoDiaRegacao = 1;
    private int ultimoDiaAdubacao = 1;
    
    public Planta(int ultimoDiaRegacao){
        this.ultimoDiaRegacao = ultimoDiaRegacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDiaDeExistencia() {
        return diaDeExistencia;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public Planta getTipo() {
        return tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setUltimoDiaAdubacao(int ultimoDiaAdubacao) {
        this.ultimoDiaAdubacao = ultimoDiaAdubacao;
    }
    
    public void setDiaDeExistencia(int dia) {
        this.diaDeExistencia = dia;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public void setTipo(Planta tipo) {
        this.tipo = tipo;
    }

    public int getUltimoDiaAdubacao() {
        return ultimoDiaAdubacao;
    }

    public int getUltimoDiaRegacao() {
        return ultimoDiaRegacao;
    }

    public void setUltimoDiaRegacao(int ultimoDiaRegacao) {
        this.ultimoDiaRegacao = ultimoDiaRegacao;
    }
        
    public abstract boolean regar(int dia);
    
    public abstract boolean adubar(int dia);

}
