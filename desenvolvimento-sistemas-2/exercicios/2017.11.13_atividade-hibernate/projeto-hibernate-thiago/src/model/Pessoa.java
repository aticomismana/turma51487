package model;

import java.io.Serializable;

import javax.persistence.Entity;
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
	private static final long serialVersionUID = 2531688576645737638L;
	@Id
	private int id;
	private int idade;
	private String nome;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(int id,int idade, String nome) {

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
