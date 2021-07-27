package vinhnq27.springframework.springbootapplication.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vinhnq27.springframework.springbootapplication.model.Author;
import vinhnq27.springframework.springbootapplication.model.Book;
import vinhnq27.springframework.springbootapplication.repositories.AuthorRepository;
import vinhnq27.springframework.springbootapplication.repositories.BookRepositoy;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepositoy bookRepositoy;

    public BootStrapData(AuthorRepository authorRepository, BookRepositoy bookRepositoy) {
        this.authorRepository = authorRepository;
        this.bookRepositoy = bookRepositoy;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Erics","Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepositoy.save(ddd);
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "39394542123");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepositoy.save(noEJB);
        System.out.println("Started in BootStrap");
        System.out.println("Number of Books: " + bookRepositoy.count());
    }
}
