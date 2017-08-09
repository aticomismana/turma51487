/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class HeartRates {
    private String nome;
    private String sobrenome;
    private Date dataNascimento; 
    
    
    public HeartRates(String nome, String sobrenome, Date datanascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = datanascimento;
    }
    
    public double calculaFrequenciaMaxima(){
        int idade = calculaIdade(dataNascimento);
        double frequenciaMax = 220 - idade;
        
        return frequenciaMax;
    }
    
    public double calculaFrequenciaMinimo(){
        double frequenciaMin = 0;
        double frequenciaMax = calculaFrequenciaMaxima();
        
        frequenciaMin = frequenciaMax * 0.85; 
        
        return frequenciaMin;
    }
    
    public int calculaIdade(Date dataNascimento){
        Calendar dataNasc = Calendar.getInstance();  
        dataNasc.setTime(dataNascimento); 
        Calendar hoje = Calendar.getInstance();  

        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR); 

        if (hoje.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH)) {
          idade--;  
        } 
        else 
        { 
            if (hoje.get(Calendar.MONTH) == dataNasc.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNasc.get(Calendar.DAY_OF_MONTH)) {
                idade--; 
            }
        }

        return idade;
    }
    
    public double calculaIntervaloMin(double frequenciaMin){
        double intervalo = 0;
        
        intervalo = frequenciaMin * 0.5;
        
        return intervalo;
    }
    
    public double calculaIntervaloMax(double frequenciaMax){
        double intervalo = 0;
        
        intervalo = frequenciaMax * 0.85;
        
        return intervalo;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
