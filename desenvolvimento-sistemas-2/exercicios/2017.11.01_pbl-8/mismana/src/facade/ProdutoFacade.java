package facade;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Produto;

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})

@Path("/produto")
public class ProdutoFacade {
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	//prepararProdutosJSON();
	
//	static Paozinho paozinho = new Paozinho(null, null, null, null, 0);
//	
//	static void teste(Produto produto) {
//		
//		if(produto instanceof Paozinho) {
//			Paozinho paozinho = (Paozinho) produto;
//			paozinho.setSabor(new Sabor(""));
//		}
//	}
	
	@GET
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	private static void prepararProdutosJSON() {
		
	}

}
