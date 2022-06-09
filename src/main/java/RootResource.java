import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;

@Path("/")
public class RootResource {

    @Context
    ResourceContext resourceContext;

    @Path("a/{id}")
    public SubResource sub() {
        return resourceContext.getResource(SubResource.class);
    }

    @Path("b/{id}Other")
    public SubResource sub2() {
        return resourceContext.getResource(SubResource.class);
    }
}
