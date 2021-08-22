package vinhnq27.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import vinhnq27.springframework.petclinic.model.Visit;
import vinhnq27.springframework.petclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if (object != null ){
            if (
                    object.getPet() == null ||
                    object.getPet().getPetType() == null ||
                    object.getPet().getPetType().getId() == null ||
                    object.getPet().getOnwer() == null ||
                    object.getPet().getOnwer().getId() == null
            ) {
                throw new RuntimeException("Invalid Visit");
            }
        }
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
