package be.gerard.example.config;

import be.gerard.provider.factory.Factory;
import be.gerard.provider.factory.ValueFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ExampleConfiguration
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Configuration
@ComponentScan({"be.gerard.provider.factory", "be.gerard.example"})
public class ExampleConfiguration {

    @Bean
    public Factory factory() {
        return new ValueFactory();
    }

}
