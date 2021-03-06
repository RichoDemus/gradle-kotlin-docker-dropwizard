package com.richodemus.kotlin.dropwizard.scan

import com.google.inject.Inject
import com.richodemus.kotlin.dropwizard.service.Service
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
internal class MyResource @Inject constructor(val service: Service) {

    @GET
    fun hello() = service.getMessage()
}
