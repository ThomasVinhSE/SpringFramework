package vinhnq27.springframework.springbootapplication.services;

import org.springframework.stereotype.Service;

public class SetterGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
