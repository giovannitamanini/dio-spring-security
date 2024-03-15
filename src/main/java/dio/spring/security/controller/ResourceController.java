package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Authorized admin!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Authorized user!";
    }
}