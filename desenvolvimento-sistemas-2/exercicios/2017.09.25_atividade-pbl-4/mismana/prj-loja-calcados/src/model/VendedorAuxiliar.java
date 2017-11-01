package model;

import java.util.ArrayList;
import java.util.Calendar;

public class VendedorAuxiliar extends Colaborador {

    public VendedorAuxiliar(Funcao funcao, Nivel nivel, int matricula, Calendar dataAdmissao, String nome, String cpf, ArrayList<FolhaPagamento> folhasPagamento) {
        super(funcao, nivel, matricula, dataAdmissao, nome, cpf, folhasPagamento);
    }

    @Override
    public Double getPercentualComissao(double valorVenda) {
        return valorVenda<200 ? 2D : 5D;
    }

    @Override
    public Double getPercentualBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args){
        // teste data 
        //VendedorAuxiliar vendedorAuxiliar = new VendedorAuxiliar();
    }

}