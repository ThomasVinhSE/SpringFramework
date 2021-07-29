package vinhnq27.springframework.springbootapplication.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vinhnq27.springframework.springbootapplication.services.ContructorGreetingImpl;

class ContructorInjectedControllerTest {
    ContructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ContructorGreetingImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}