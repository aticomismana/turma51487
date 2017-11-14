package facade;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;

import model.Pessoa;
import model.dao.PessoaDAO;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})

@Consumes({MediaType.APPLICATION_JSON})

@Path("/pessoas")
public class PessoaFacade {
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	static {
		pessoas.add(new Pessoa("Fran", 26));
		pessoas.add(new Pessoa("David", 19));
		pessoas.add(new Pessoa("Mouse", 15));
	}
	
	@GET
	public ArrayList<Pessoa> getPessoaFacade() {
//		Pessoa p1 = new Pessoa("Fran", 26);
//		try {
//			new PessoaDAO().inserePessoa(p1);
//		} catch (Exception e) {
//			System.out.println(e);
//			return e;
//		}
//		return new Exception();
		PessoaDAO pessoaDAO = new PessoaDAO();
		return pessoaDAO.getPessoas();
	}
}
