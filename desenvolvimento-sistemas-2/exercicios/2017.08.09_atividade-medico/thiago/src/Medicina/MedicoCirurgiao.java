/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicina;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class MedicoCirurgiao extends Medico {
    @Override
     boolean medicoAposentado(){
        return super.getIdade() > 50;
    }
     
    @Override
    double valorAposentadoria(){
        return super.getSalario() * 0.8 + 800;
    }
}
