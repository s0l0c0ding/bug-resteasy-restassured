package org.acme;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello-resteasy")
public class GreetingResource {



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response redirect() {
        var uri = URI.create("https://code.quarkus.io");
        return Response.temporaryRedirect(uri).build();
    }
}