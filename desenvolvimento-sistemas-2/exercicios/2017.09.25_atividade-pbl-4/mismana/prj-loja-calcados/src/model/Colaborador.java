package model;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Colaborador extends Pessoa {
    private Funcao funcao;
    private Nivel nivel;
    private int matricula;
    private Calendar dataAdmissao;
    private ArrayList<FolhaPagamento> folhasPagamento;

    public Colaborador(Funcao funcao, Nivel nivel, int matricula, Calendar dataAdmissao, String nome, String cpf, ArrayList<FolhaPagamento> folhasPagamento) {
        super(nome, cpf);
        this.funcao = funcao;
        this.nivel = nivel;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.folhasPagamento = folhasPagamento;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public int getMatricula() {
        return matricula;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public ArrayList<FolhaPagamento> getFolhasPagamento() {
        return folhasPagamento;
    }
    
    public abstract Double getPercentualComissao(double valorVenda);
    public abstract Double getPercentualBonificacao();
    
    protected boolean tempoServico(int qtdMeses, Calendar dataFinalPeriodoLaboral) {

        Calendar tempoServico = dataFinalPeriodoLaboral;
        tempoServico.add(Calendar.DATE, - this.dataAdmissao.get(Calendar.MONTH));
        System.out.println(tempoServico.get(Calendar.MONTH));
        
        return false;
//    Calendar a = Calendar.getInstance();
//    a.setTime(new Date());//data maior
//    Calendar b = Calendar.getInstance();
//    b.set(2013, 3, 15);// data menor
//    a.add(Calendar.DATE, - b.get(Calendar.DAY_OF_MONTH));
//    System.out.println(a.get(Calendar.DAY_OF_MONTH)); 
    }
}