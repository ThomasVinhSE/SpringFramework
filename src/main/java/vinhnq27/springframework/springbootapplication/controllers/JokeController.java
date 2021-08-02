package vinhnq27.springframework.springbootapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vinhnq27.springframework.springbootapplication.services.JokeService;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
