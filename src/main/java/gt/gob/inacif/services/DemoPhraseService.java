package gt.gob.inacif.services;

import gt.gob.inacif.repositories.DemoPhraseRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

/**
 *
 * @author esvux
 */
@RequestScoped
public class DemoPhraseService {
    
    @Inject
    DemoPhraseRepository phraseRepo;
    
}
