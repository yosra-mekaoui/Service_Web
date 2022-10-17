package rest.filters;

import java.lang.annotation.Retention;
import java.lang.annotation.*;

import javax.ws.rs.*;

@NameBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })

public @interface Secured {

}
