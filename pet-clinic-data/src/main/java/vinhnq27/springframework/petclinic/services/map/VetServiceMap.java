package vinhnq27.springframework.petclinic.services.map;

import vinhnq27.springframework.petclinic.model.Pet;
import vinhnq27.springframework.petclinic.model.Vet;
import vinhnq27.springframework.petclinic.services.CrudService;
import vinhnq27.springframework.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstracMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    public VetServiceMap() {
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
