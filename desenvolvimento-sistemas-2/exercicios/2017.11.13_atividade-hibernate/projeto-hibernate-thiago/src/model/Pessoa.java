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
public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pessoa")
	private int id;
	@Column(name="nome", nullable=false, length=100)
	private String nome;
	@Column(name="idade")
	private int idade;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
		
	public int getId() {
		return id;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	
}
