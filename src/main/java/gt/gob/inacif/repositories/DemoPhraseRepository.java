package gt.gob.inacif.repositories;

import gt.gob.inacif.models.DemoPhrase;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

/**
 *
 * @author esvux
 */
@RequestScoped
public class DemoPhraseRepository implements PanacheRepository<DemoPhrase> {

    @Transactional
    public void create(DemoPhrase newPhrase) {
        this.persist(newPhrase);
    }

}
