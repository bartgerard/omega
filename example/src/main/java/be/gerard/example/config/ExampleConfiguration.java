package be.gerard.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ExampleConfiguration
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Configuration
@ComponentScan({
        "be.gerard.provider.factory",
        "be.gerard.example.mapping"
})
public class ExampleConfiguration {

}
