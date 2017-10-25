package model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
	
@Path("/pessoa")
@Produces( { MediaType.APPLICATION_XML })
public class Pessoa {
	@GET
	public String executaGet() {
		return "Hello world";
	}
	
}
