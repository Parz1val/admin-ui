package com.ocdsoft.bacta.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by Kyle on 4/1/2015.
 */
@Path(value = "/")
public class MainResource {

    @GET
    public Response main() {
        return Response.ok().entity("YAY").build();
    }

}
