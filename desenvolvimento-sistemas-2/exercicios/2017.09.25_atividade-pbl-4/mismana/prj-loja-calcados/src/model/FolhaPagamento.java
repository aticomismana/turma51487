package model;

import java.util.ArrayList;
import java.util.Date;

public class FolhaPagamento {
    private Date dataPagamento;
    private PeriodoLaboral periodoLaboral;
    private ArrayList<ItemFolhaPagamento> itensFolhaPagamento;

    public FolhaPagamento(Date dataPagamento, PeriodoLaboral periodoLaboral, ArrayList<ItemFolhaPagamento> itensFolhaPagamento) {
        this.dataPagamento = dataPagamento;
        this.periodoLaboral = periodoLaboral;
        this.itensFolhaPagamento = itensFolhaPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public PeriodoLaboral getPeriodoLaboral() {
        return periodoLaboral;
    }

    public void setPeriodoLaboral(PeriodoLaboral periodoLaboral) {
        this.periodoLaboral = periodoLaboral;
    }

    public ArrayList<ItemFolhaPagamento> getItensFolhaPagamento() {
        return itensFolhaPagamento;
    }
}