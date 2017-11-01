/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author aluno
 */
public class Paragrafos extends Html{
    public Paragrafos(String corAux, double tamAux){
        this.cor = corAux;
        this.tamanho = tamAux;
        Html.qtdTextos ++;
    }
}
