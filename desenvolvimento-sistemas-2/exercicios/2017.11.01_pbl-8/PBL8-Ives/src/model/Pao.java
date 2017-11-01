package model;

import java.util.Date;

public class Pao extends Produto{
	private String sabor_paozinho;
	
	public Pao(String sabor_paozinho, String nome, Double preco, String especificacao, Date validade) {
		this.sabor_paozinho = sabor_paozinho;
		this.setNome(nome);
		this.setPreco(preco);
		this.setEspecificacao(especificacao);
		this.setValidade(validade);
	}
	
	public String getSabor_paozinho() {
		return sabor_paozinho;
	}
	
	public void setSabor_paozinho(String sabor_paozinho) {
		this.sabor_paozinho = sabor_paozinho;
	}
}
