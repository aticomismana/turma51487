package model;

import java.util.Date;

public class Frios extends Produto{
	
	public Frios(String nome, Double preco, String especificacao, Date validade) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setEspecificacao(especificacao);
		this.setValidade(validade);
	}
}
