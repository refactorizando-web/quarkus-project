package com.refactorizando.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;


@Path("/helloworld")
public class HelloWorldResource {

    @Inject
    HelloWorldService helloWorldService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/sayHello/{name}")
    public String hello(@PathParam String name) {
        return helloWorldService.sayHello(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}