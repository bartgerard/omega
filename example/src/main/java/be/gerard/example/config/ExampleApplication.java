package be.gerard.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * ExampleApplication
 *
 * @author bartgerard
 * @version v0.0.1
 */
@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
    }

}
