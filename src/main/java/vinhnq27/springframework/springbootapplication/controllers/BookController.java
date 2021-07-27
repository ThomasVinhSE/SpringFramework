package vinhnq27.springframework.springbootapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vinhnq27.springframework.springbootapplication.repositories.BookRepositoy;

@Controller
public class BookController {

    private final BookRepositoy bookRepositoy;

    public BookController(BookRepositoy bookRepositoy) {
        this.bookRepositoy = bookRepositoy;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepositoy.findAll());
        return "books/list";
    }
}
