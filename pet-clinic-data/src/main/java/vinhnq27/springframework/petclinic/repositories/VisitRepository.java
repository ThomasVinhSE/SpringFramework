package vinhnq27.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.petclinic.model.Visit;

import java.util.Optional;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
