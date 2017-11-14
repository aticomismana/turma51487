package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="pessoa")

public class Pessoa implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//GERAR ID AUTO INCREMENT
	@Column(name="id_pessoa")
	private Integer id_pessoa;
	@Column(name="nome")
	private String nome;
	@Column(name="idade")
	private Integer idade;
	
	public Pessoa() {
		//Construtor
	}
	
	public Pessoa(String nome, int idade) {
		//Construtor
		this.idade = idade;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id_pessoa;
	}
	public void setId(Integer id) {
		this.id_pessoa = id;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
