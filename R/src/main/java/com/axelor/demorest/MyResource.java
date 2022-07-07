package com.axelor.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
	
	
	
	// by default all the req are GET
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it";
	}

}
