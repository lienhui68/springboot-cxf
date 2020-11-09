package com.eh.cxf;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/book")
public interface HelloService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON) // 表示输出为json
    @Consumes(MediaType.WILDCARD) // 表示输入为 */*
    Book sayHello(@PathParam("id") Integer id);
}
