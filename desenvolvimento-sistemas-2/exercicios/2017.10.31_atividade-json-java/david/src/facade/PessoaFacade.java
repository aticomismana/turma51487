package facade;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import model.Pessoa;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})

@Consumes({MediaType.APPLICATION_JSON})

@Path("/pessoas")
public class PessoaFacade {
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	static {
		pessoas.add(new Pessoa("Fran", "12345678", 26));
		pessoas.add(new Pessoa("David", "54214567", 19));
		pessoas.add(new Pessoa("Mouse", "12346625", 15));
	}
	
	@GET
	public ArrayList<Pessoa> executaGet(){
		return pessoas;
	}
}
