package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Pessoa implements Serializable{
	private String nome;
	private String tel;
	private Integer idade;
	
	public Pessoa(String nome, String tel, Integer idade) {
		this.nome = nome;
		this.tel = tel;
		this.idade = idade;
	}
	public Pessoa(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
