package com.swaggerjrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("r1")
public class R1 {
	
	 private EmployeeService eService = EmployeeService.getInstance();

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() {
		
		Employee e1 = new Employee();
		e1.setFirstName("abc");
		e1.setLastName("zys");
		
		List<Employee> e = eService.getEmployees();
		return Response.status(200).entity(e1).build() ;
	}
	
}
