package gt.gob.inacif.controllers;

import gt.gob.inacif.models.DemoPhrase;
import gt.gob.inacif.repositories.DemoPhraseRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author esvux
 */
@Path("/phrases")
@RequestScoped
public class DemoPhraseController {
    
    @Inject
    DemoPhraseRepository phraseRepo;
    
    @POST
    public Response saveNewPhrase(@Valid DemoPhrase phrase) {
        phraseRepo.create(phrase);
        System.out.println("Saved... " + phrase);
        return Response.ok().build();
    }
    
}
