package vinhnq27.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.petclinic.model.Owner;

public interface OwnerRepository  extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
