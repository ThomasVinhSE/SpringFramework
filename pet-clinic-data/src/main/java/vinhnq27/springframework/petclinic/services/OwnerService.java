package vinhnq27.springframework.petclinic.services;

import vinhnq27.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
