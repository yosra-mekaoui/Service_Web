package rest.utilities;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import rest.ressources.GestionEmploye;

@ApplicationPath("/api")
public class RestActivator extends Application {

	
	
	public RestActivator() {
        super();
        BeanConfig beanConfig=new BeanConfig();
        beanConfig.setTitle("API CRUD EMployees");
        beanConfig.setDescription("API pour la Gestion des Employees");
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[] {"http"});
        beanConfig.setHost("localhost:8081");
        beanConfig.setBasePath("GestionEmploye/api");
        beanConfig.setResourcePackage("rest.ressources");
        beanConfig.setPrettyPrint(true); // Affichage des donn�es en swagger.json bien structur�es
        beanConfig.setScan(true);



    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(GestionEmploye.class);
        // Available at localhost:port/swagger.json
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return resources;

    }
}
