package org.eclipse.jakarta.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.apache.commons.lang3.StringUtils;

/** Hello API. */
@Path("hello")
public class HelloWorldResource {

    /** Get hello with the given name. */
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Hello hello(@QueryParam("name") String name) {
        return new Hello(StringUtils.defaultIfBlank(name, "world"));
    }
}
