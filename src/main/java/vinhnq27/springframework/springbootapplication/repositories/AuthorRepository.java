package vinhnq27.springframework.springbootapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.springbootapplication.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
