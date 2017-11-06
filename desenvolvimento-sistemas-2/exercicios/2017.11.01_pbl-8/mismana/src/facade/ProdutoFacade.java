package facade;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Doce;
import model.Frio;
import model.Paozinho;
import model.Produto;
import model.Sabor;
import model.TipoDoce;

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})

@Path("/produto")
public class ProdutoFacade {
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
//	static Paozinho paozinho = new Paozinho(null, null, null, null, 0);
//	
//	static void teste(Produto produto) {
//		
//		if(produto instanceof Paozinho) {
//			Paozinho paozinho = (Paozinho) produto;
//			paozinho.setSabor(new Sabor(""));
//		}
//	}
	
	static {
		//-------------------------------------------------
		// DOCE
		//-------------------------------------------------
		Doce doceFino1 = new Doce(
				new TipoDoce("Fino"),
				new Double(4.00),
				new Double(6D),
				new String("Doce fino"),
				new Double(90d)
		);
		produtos.add(doceFino1);
		//
		Doce doceFesta1 = new Doce(
				new TipoDoce("Festa"),
				new Double(5.00),
				new Double(3D),
				new String("Doce de Festa"),
				new Double(90d)
		);
		produtos.add(doceFesta1);
		//
		Doce doceGourmet1 = new Doce(
				new TipoDoce("Gourmet"),
				new Double(2.50),
				new Double(4D),
				new String("Doce Gourmet"),
				new Double(90d)
		);
		produtos.add(doceGourmet1);
		//
		Doce doceOrnamental1 = new Doce(
				new TipoDoce("Ornamental"),
				new Double(6.00),
				new Double(7D),
				new String("Doce Ornamental"),
				new Double(90d)
		);
		produtos.add(doceOrnamental1);
		//-------------------------------------------------
		// fim DOCE
		//-------------------------------------------------
		
		//-------------------------------------------------
		// PAO
		//-------------------------------------------------
		Paozinho paozinho1 = new Paozinho(
			new Sabor("Queijo"),
			new Double(6.00),
			new Double(7D),
			new String("Paozinho de Queijo"),
			new Double(90d)	
		);
		produtos.add(paozinho1);
		//
		Paozinho paozinho2 = new Paozinho(
			new Sabor("Frango"),
			new Double(6.00),
			new Double(7D),
			new String("Paozinho de Frango"),
			new Double(90d)	
		);
		produtos.add(paozinho2);
		//
		Paozinho paozinho3 = new Paozinho(
			new Sabor("Atum"),
			new Double(6.00),
			new Double(7D),
			new String("Paozinho de Atum"),
			new Double(90d)	
		);
		produtos.add(paozinho3);	
		//-------------------------------------------------
		// fim PAO
		//-------------------------------------------------
		
		//-------------------------------------------------
		// FRIOS
		//-------------------------------------------------
		Frio frioQueijo = new Frio(
			new Double(6.00),
			new Double(7D),
			new String("Queijo"),
			new Double(90d)	
		);
		produtos.add(frioQueijo);
		Frio frioPresunto = new Frio(
			new Double(6.00),
			new Double(7D),
			new String("Presunto"),
			new Double(90d)	
		);
		produtos.add(frioPresunto);
		//-------------------------------------------------
		// fim FRIOS
		//-------------------------------------------------
	}
	
	@GET
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
