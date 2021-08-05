package vinhnq27.springframework.springbootapplication.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vinhnq27.springframework.springbootapplication.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
