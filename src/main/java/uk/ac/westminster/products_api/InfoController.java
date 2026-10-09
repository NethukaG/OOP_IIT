package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Tutorial 1 stretch task: a second controller, so Swagger UI shows
 * endpoints grouped under separate controllers.
 */
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "products-api: a Spring Boot REST API built for 5COSC019W Object Oriented Programming.";
    }
}
