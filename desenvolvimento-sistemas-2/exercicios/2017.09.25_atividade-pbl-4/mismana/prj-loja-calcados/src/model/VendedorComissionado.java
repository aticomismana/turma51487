package model;

import java.util.ArrayList;
import java.util.Calendar;

public class VendedorComissionado extends Colaborador {

    public VendedorComissionado(Funcao funcao, Nivel nivel, int matricula, Calendar dataAdmissao, String nome, String cpf, ArrayList<FolhaPagamento> folhasPagamento) {
        super(funcao, nivel, matricula, dataAdmissao, nome, cpf, folhasPagamento);
    }
    
    @Override
    public Double getPercentualComissao(double valorVenda) {
        return 15D;
    }

    @Override
    public Double getPercentualBonificacao() {
        //return valorVenda<200 ? 2D : 5D;
        return null;
    }
}