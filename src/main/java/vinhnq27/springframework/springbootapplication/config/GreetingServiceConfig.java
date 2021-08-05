package vinhnq27.springframework.springbootapplication.config;

import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.*;
import vinhnq27.springframework.springbootapplication.repositories.EnglishGreetingRepository;
import vinhnq27.springframework.springbootapplication.repositories.EnglishGreetingRepositoryImpl;
import vinhnq27.springframework.springbootapplication.services.*;

@ImportResource("classpath:config.xml")
@Configuration
public class GreetingServiceConfig {

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }
    @Profile({"cat"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }
    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }
    @Profile(("ES"))
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }
    @Profile({"EN", "default"})
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }
    @Bean
    PropertyGreetingImpl propertyGreetingImpl() {
        return new PropertyGreetingImpl();
    }
    @Bean
    SetterGreetingImpl setterGreetingImpl() {
        return new SetterGreetingImpl();
    }
}
