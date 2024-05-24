package gt.gob.inacif.utils;

import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

/**
 *
 * @author esvux
 */
@Provider
public class ConstraintValidationExceptionHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException e) {
        var message = "\"Revisa los datos de tu petición\"";
        return Response.status(444).entity(message).build();
    }
    
}
