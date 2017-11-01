package model;

public class Doce extends Produto {
	private TipoDoce tipoDoce;

	public Doce(TipoDoce tipoDoce, Double preco, Double validade, String especificacao, double tempoMinEntrega) {
		super(preco, validade, especificacao, tempoMinEntrega);
		this.tipoDoce = tipoDoce;
	}

	public TipoDoce getTipoDoce() {
		return tipoDoce;
	}

	public void setTipoDoce(TipoDoce tipoDoce) {
		this.tipoDoce = tipoDoce;
	}
}
