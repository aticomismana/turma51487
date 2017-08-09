/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicina;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Medico {
    protected int crm;
    protected String nome;
    protected double salario;
    protected int idade;

    public int getCrm() {
        return crm;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    boolean medicoAposentado(){;
        return this.idade > 55;
    }
    
   
    double valorAposentadoria(){
        return this.salario * 0.8;
    }
    
}
