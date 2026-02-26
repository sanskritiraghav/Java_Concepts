package com.test;


import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String simplePlainTestResponse() {
		return "This is simple Restful web service Plain text Response";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card) {
		return "<html><body> <h1> Simple RestAPI HTML Response card no: "+card+" </h1> </body></html>";
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg) {
		return msg;
	}
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData(){
		UserDetails u1 = new UserDetails(1,"Sanskriti", "Raghav","sr@dev.com",12345);
		UserDetails u2 = new UserDetails(2,"Arti", "Raghav","ar@dev.com",14325);
		UserDetails u3 = new UserDetails(3,"Virat", "Kolhi","vk@dev.com",12543);
		return List.of(u1,u2,u3);
	}
}
