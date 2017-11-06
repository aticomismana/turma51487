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
	
	@GET
	public ArrayList<Produto> executaGet(){
		return produtos;
	}
	
	@POST 
	public String postMessage(Produto produto) throws Exception{
		System.out.println(produto.toString());
		produto.id = produtos.size();
		if(produto.tipo_produto.equals("pao")) {
			Pao pao = (Pao) produto;
			produtos.add(pao);
		}
		else if(produto.tipo_produto.equals("doce")) {
			Doce doce = (Doce) produto;
			produtos.add(doce);
		}
		else if(produto.tipo_produto.equals("frios")) {
			Frios frios = (Frios) produto;
			produtos.add(frios);
		}

        return "ok";
    }
}