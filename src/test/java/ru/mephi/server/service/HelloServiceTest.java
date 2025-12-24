package ru.mephi.server.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    @Test
    void generateGreeting_shouldReturnCorrectMessage() {
        HelloService helloService = new HelloService();
        String greeting = helloService.generateGreeting();
        assertEquals("Hello from Spring Boot application", greeting);
    }
}
