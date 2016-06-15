package be.gerard.user;

import be.gerard.user.config.UserWebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * UserWebApplication
 *
 * @author bartgerard
 * @version v0.0.1
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = UserWebConfig.class)
public class UserWebApplication extends SpringBootServletInitializer {

    /* JAR */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(UserWebApplication.class, args);
    }

    /* WAR */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(UserWebApplication.class);
        return super.configure(builder);
    }

}
