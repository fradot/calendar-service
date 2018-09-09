package com.piggymetrics.calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/event")
public class EventResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getEvent() {
        return Response.ok("Great,it works!").build();
    }


}
