package facade;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

import model.Pessoa;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})
@Consumes({MediaType.APPLICATION_JSON})
@Path("/pessoas")

public class PessoaFacade {
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	static {
		pessoas.add(new Pessoa("Ives", "123456", 19));
		pessoas.add(new Pessoa("Fran", "654321", 26));
		pessoas.add(new Pessoa("Icaro", "789456", 17));
	}
	
	@GET
	public ArrayList<Pessoa> executaGET(){
		return pessoas;
	}
}
