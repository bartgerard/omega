package be.gerard.user.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * UserWebConfig
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Configuration
@ComponentScan({
        "be.gerard.provider.factory",
        "be.gerard.user",
})
public class UserWebConfig {
}
