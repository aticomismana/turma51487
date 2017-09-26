package model;

public class ItemFolhaPagamento {
    private Rubrica rubrica;
    private Double quantidade;
    private Double valor;

    public ItemFolhaPagamento(Rubrica rubrica, Double quantidade, Double valor) {
        this.rubrica = rubrica;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Rubrica getRubrica() {
        return rubrica;
    }

    public void setRubrica(Rubrica rubrica) {
        this.rubrica = rubrica;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}