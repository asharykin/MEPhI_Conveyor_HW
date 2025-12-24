package ru.mephi.server.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String generateGreeting() {
        return "Hello from Spring Boot application";
    }
}
