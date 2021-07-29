package vinhnq27.springframework.springbootapplication.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vinhnq27.springframework.springbootapplication.services.ContructorGreetingImpl;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ContructorGreetingImpl();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}