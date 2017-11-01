package model;

import java.util.Date;

public class Doce extends Produto{
	private String tipo_de_doce;
	
	public Doce(String tipo_de_doce, String nome, Double preco, String especificacao, Date validade) {
		this.tipo_de_doce = tipo_de_doce;
		this.setNome(nome);
		this.setPreco(preco);
		this.setEspecificacao(especificacao);
		this.setValidade(validade);
	}
	
	public String getTipo_de_doce() {
		return tipo_de_doce;
	}
	
	public void setTipo_de_doce(String tipo_de_doce) {
		this.tipo_de_doce = tipo_de_doce;
	}
}
