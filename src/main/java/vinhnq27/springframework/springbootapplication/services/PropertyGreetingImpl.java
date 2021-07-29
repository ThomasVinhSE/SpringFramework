package vinhnq27.springframework.springbootapplication.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
