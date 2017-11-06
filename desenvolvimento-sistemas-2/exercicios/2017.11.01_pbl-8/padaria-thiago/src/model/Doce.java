package model;

import java.io.Serializable;
import java.util.Date;

public class Doce extends Produto implements Serializable  {
	private static final long serialVersionUID = 1L;

	private String tipo_doce;
	
	public Doce(String tipo_doce, String nome, Double preco, String especificacao, String validade) {
		this.setEspecificacao(especificacao);
		this.setNome(nome);
		this.setPreco(preco);
		this.setValidade(validade);
		this.setTipo_doce(tipo_doce);
	}
	
	public Doce() {
		
	}

	public String getTipo_doce() {
		return tipo_doce;
	}

	public void setTipo_doce(String tipo_doce) {
		this.tipo_doce = tipo_doce;
	}
	
	
}
