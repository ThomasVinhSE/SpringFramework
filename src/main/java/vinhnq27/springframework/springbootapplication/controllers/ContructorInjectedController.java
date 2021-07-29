package vinhnq27.springframework.springbootapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vinhnq27.springframework.springbootapplication.services.GreetingService;

@Controller
public class ContructorInjectedController {
    private final GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    public ContructorInjectedController(@Qualifier("contructorGreetingImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
