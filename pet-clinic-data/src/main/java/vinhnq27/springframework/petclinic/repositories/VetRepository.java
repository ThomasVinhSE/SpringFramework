package vinhnq27.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.petclinic.model.Pet;
import vinhnq27.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
