package vinhnq27.springframework.petclinic.services.map;

import vinhnq27.springframework.petclinic.model.Owner;
import vinhnq27.springframework.petclinic.model.Pet;
import vinhnq27.springframework.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstracMapService<Pet, Long> implements CrudService<Pet, Long> {
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
