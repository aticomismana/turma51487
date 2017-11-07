package facade;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

@Consumes({MediaType.APPLICATION_JSON})

@Path("/pedidos")
public class facadePedido {
	static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	@GET
	public ArrayList<Pedido> executaGet(){
		return pedidos;
	}
	
	@POST 
	public String postMessage(Pedido pedido) throws Exception{
		pedido.setDataPedido(new Date().toString());

		pedidos.add(pedido);

        return "ok";
    }
	
}
