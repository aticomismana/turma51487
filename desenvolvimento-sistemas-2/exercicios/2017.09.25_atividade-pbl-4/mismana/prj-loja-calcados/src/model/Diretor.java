package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Diretor extends Colaborador {

    public Diretor(Funcao funcao, Nivel nivel, int matricula, Calendar dataAdmissao, String nome, String cpf, ArrayList<FolhaPagamento> folhasPagamento) {
        super(funcao, nivel, matricula, dataAdmissao, nome, cpf, folhasPagamento);
    }

    @Override
    public Double getPercentualComissao(double valorVenda) {
        return 5D;
    }

    @Override
    public Double getPercentualBonificacao() {
        return 10D;
    }
}