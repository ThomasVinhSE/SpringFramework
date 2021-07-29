package vinhnq27.springframework.springbootapplication.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vinhnq27.springframework.springbootapplication.services.ContructorGreetingImpl;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ContructorGreetingImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}