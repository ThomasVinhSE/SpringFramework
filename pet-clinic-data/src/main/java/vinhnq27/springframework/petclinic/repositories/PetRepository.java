package vinhnq27.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
