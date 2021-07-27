package vinhnq27.springframework.springbootapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import vinhnq27.springframework.springbootapplication.model.Book;

public interface BookRepositoy extends CrudRepository<Book, Long> {
}
