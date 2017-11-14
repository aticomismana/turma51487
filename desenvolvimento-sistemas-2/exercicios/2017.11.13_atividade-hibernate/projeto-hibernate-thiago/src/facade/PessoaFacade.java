package facade;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;
import dao.*;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

@Consumes({MediaType.APPLICATION_JSON})


@Path("/pessoas")
public class PessoaFacade {
	
	static {
		Pessoa pessoa = new Pessoa(19, "THiago");
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.inserePessoa(pessoa);
	}

	@GET
	public ArrayList<Pessoa> executaGet() {
		PessoaDAO pessoaDAO2 = new PessoaDAO();
		return pessoaDAO2.getPessoa();
	}
	
	@POST 
	public void postMessage(Pessoa pessoa) {

    }
}
