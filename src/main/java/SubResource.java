import io.quarkus.arc.Unremovable;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Unremovable
@RequestScoped
@Produces("text/plain")
public class SubResource {



    @Path("/greet")
    @GET
    public String greet(@PathParam("id") String id){
        return "Hello " + id;
    }


}
