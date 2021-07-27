package vinhnq27.springframework.springbootapplication.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vinhnq27.springframework.springbootapplication.model.Author;
import vinhnq27.springframework.springbootapplication.model.Book;
import vinhnq27.springframework.springbootapplication.model.Publisher;
import vinhnq27.springframework.springbootapplication.repositories.AuthorRepository;
import vinhnq27.springframework.springbootapplication.repositories.BookRepositoy;
import vinhnq27.springframework.springbootapplication.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepositoy bookRepositoy;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepositoy bookRepositoy, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepositoy = bookRepositoy;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");
        publisherRepository.save(publisher);
        System.out.println("Started in BootStrap");
        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepositoy.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "39394542123");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepositoy.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: " + bookRepositoy.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());

    }
}
