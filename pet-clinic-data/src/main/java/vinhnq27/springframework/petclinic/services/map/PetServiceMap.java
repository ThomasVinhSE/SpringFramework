package vinhnq27.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import vinhnq27.springframework.petclinic.model.Pet;
import vinhnq27.springframework.petclinic.services.CrudService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    public PetServiceMap() {
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
