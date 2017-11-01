package model;

import java.io.Serializable;
import java.util.Date;

public class Pao extends Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sabor;
	
	public Pao(String sabor, String nome, Double preco, String especificacao, Date validade) {
		this.setEspecificacao(especificacao);
		this.setNome(nome);
		this.setPreco(preco);
		this.setValidade(validade);
		this.setSabor(sabor);
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
}
