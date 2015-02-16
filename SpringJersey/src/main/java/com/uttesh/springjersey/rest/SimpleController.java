package com.uttesh.springjersey.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rivet Systems
 */
@Component
@Path("/simple")
public class SimpleController {
 
	@GET
	@Path("/hello")
	public Response hello() {
		return Response.status(200).entity("Hello World").build();
	}
}
