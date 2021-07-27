package vinhnq27.springframework.springbootapplication.repositories;


import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.springbootapplication.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
