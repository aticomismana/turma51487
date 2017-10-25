package model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("pessoa")
public class Pessoa {
	@GET
	public String executaGet() {
		return "Olá mundo, estamos fazendo um GET! \\O// ";
	}
}
