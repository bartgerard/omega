package be.gerard.user.service.config;

import be.gerard.persistence.shared.v1.UserAuditorAware;
import be.gerard.user.service.dao.UserDao;
import be.gerard.user.service.model.UserRecord;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * UserConfig
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackageClasses = UserRecord.class)
@EnableJpaRepositories(basePackageClasses = UserDao.class)
@EnableJpaAuditing
public class UserConfig {

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.H2)
                .build();
    }

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new UserAuditorAware();
    }

}
