package model;
import java.util.ArrayList;

public class Pedido {
	private int idPedido;
	private String dataPedido;
	private ArrayList<ItemPedido> itensPedido;
	private Double valorPedido;
	
	public Pedido(int idPedido, String dataPedido, ArrayList<ItemPedido> itensPedido, Double valorPedido) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.itensPedido = itensPedido;
		this.valorPedido = valorPedido;
		
		if(itensPedido == null) {
			itensPedido = new ArrayList<ItemPedido>();
		}
			
		this.itensPedido = itensPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}
	
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	public String getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public ArrayList<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	
	public Double getValorPedido() {
		return valorPedido;
	}
	
	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}
}
