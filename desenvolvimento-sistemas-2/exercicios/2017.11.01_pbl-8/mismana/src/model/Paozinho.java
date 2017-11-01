package model;

public class Paozinho extends Produto {
	private Sabor sabor;

	public Paozinho(Sabor sabor, Double preco, Double validade, String especificacao, double tempoMinEntrega) {
		super(preco, validade, especificacao, tempoMinEntrega);
		this.sabor = sabor;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
}
