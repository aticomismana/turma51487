package facade;

import java.util.ArrayList;

import javax.persistence.Query;
import javax.ws.rs.GET;

import model.Pessoa;

public class PessoaFacade {
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	static {
		pessoas.add(new Pessoa("fran", 25));
		pessoas.add(new Pessoa("cobrador", 32));
		pessoas.add(new Pessoa("david", 19));
	}
	
	@GET
	public ArrayList<Pessoa> getPessoaFacade(){
		Query p1 = (Query) new Pessoa("fran", 25);
		return null;
	}
}
