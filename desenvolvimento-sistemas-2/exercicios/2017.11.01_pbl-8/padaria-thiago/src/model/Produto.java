package model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public abstract class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private Double preco;
	private String especificacao;
	private Date validade;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getEspecificacao() {
		return especificacao;
	}
	
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
}
