package be.gerard.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 * ExampleApplication
 *
 * @author bartgerard
 * @version v0.0.1
 */
@SpringBootApplication
public class ExampleApplication extends SpringBootServletInitializer {

    /* JAR */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
    }

    /* WAR */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(ExampleApplication.class);
        return super.configure(builder);
    }

}
