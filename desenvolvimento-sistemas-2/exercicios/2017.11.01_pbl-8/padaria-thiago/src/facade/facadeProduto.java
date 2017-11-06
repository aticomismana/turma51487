package facade;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

@Consumes({MediaType.APPLICATION_JSON})

@Path("/produtos")
public class facadeProduto {
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	static {
		produtos.add(new Pao("Queijo", "Pão de queijo", 10.00, "teste", "27-11-1999"));
	}
	
	@GET
	public ArrayList<Produto> executaGet(){
		return produtos;
	}
	
	@POST 
	public void executaPost(Produto produto) {
		System.out.println(produto.toString());
		produtos.add(produto);
	}
}