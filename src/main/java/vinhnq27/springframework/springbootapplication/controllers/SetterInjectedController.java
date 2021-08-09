package vinhnq27.springframework.springbootapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vinhnq27.springframework.springbootapplication.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    @Qualifier("setterGreetingImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}