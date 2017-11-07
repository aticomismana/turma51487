package model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	private String dataPedido;
	private int quantidade;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getDataPedido() {
		return dataPedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
}
