/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.bean.Auxiliar;
import Model.bean.Comissionado;
import Model.bean.Diretor;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author davii
 */
public class DAOTest {
    
    public DAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        Diretor dir = new Diretor("david", 111, 1500.00);
        DiretorDAO dao01 = new DiretorDAO();
        
        if(dao01.createDir(dir)){
            System.out.println("Salvo com sucesso!");
        }else{
            fail("Error ao salvar!");
        }
    }
    
    @Test
    @Ignore
    public void listar(){
    
        DiretorDAO dao01 = new DiretorDAO();
        
        for(Diretor d: dao01.buscarDir()){
            System.out.println("Nome: " + d.getNome()
                              +" Cpf: " + d.getCpf()
                              +" Salario: " + d.getSalario());
        }
    }
    
    @Test
    public void deletar(){
        Diretor dir = new Diretor();
        dir.setId(1);
        
        DiretorDAO dao01 = new DiretorDAO();
        
        if(dao01.deleteDir(dir)){
            System.err.println("Deletado com sucesso");
        }else{
            fail("Error ao deletar");
        }
    }
    
    @Test
    @Ignore
    public void atualizar() {
        Diretor dir = new Diretor("davi", 11, 1000.00);
        dir.setId(1);
        DiretorDAO dao01 = new DiretorDAO();
        
        if(dao01.updateDir(dir)){
            System.out.println("Atualizado com sucesso!");
        }else{
            fail("Error ao atualizar!");
        }
    }
}
