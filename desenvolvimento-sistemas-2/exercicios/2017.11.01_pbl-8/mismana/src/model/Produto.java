package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Double preco;
	private Double validade;
	private String especificacao;
	private double tempoMinEntrega;
	
	public Produto(Double preco, Double validade, String especificacao, double tempoMinEntrega) {
		this.preco = preco;
		this.validade = validade;
		this.especificacao = especificacao;
		this.tempoMinEntrega = tempoMinEntrega;
	}
	
	public Produto() {
		
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getValidade() {
		return validade;
	}
	
	public void setValidade(Double validade) {
		this.validade = validade;
	}
	
	public String getEspecificacao() {
		return especificacao;
	}
	
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	public double getTempoMinEntrega() {
		return tempoMinEntrega;
	}
	
	public void setTempoMinEntrega(double tempoMinEntrega) {
		this.tempoMinEntrega = tempoMinEntrega;
	}
}
