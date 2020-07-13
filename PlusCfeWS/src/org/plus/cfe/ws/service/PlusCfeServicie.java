package org.plus.cfe.ws.service;



//@Path("PlusCfeServicie")
public class PlusCfeServicie {

	
	@POST 
	@Path("setreception")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setPartnerReception(String reception){

		int respuesta = -1;
		
		try {
			RetailServiceImpl impl = new RetailServiceImpl();
			respuesta = impl.setPartnerReception(reception);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Response.status(201).entity(respuesta).build();
		
	}	
}
