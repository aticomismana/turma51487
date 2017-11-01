package facade;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})

@Consumes({MediaType.APPLICATION_JSON})

@Path("/produtos")
public class facadeProduto {
	static ArrayList<Produto> pessoas = new ArrayList<Produto>();
	
	static {
		
	}
	
	@GET
	public ArrayList<Produto> executaGet(){
		return pessoas;
	}
	
	@POST
	public void executaPost() {
		
	}
}