package vinhnq27.springframework.petclinic.services.map;

import vinhnq27.springframework.petclinic.model.Owner;
import vinhnq27.springframework.petclinic.services.CrudService;
import vinhnq27.springframework.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstracMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    public OwnerServiceMap() {
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
