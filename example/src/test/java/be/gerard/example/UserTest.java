package be.gerard.example;

import be.gerard.example.config.ExampleConfiguration;
import be.gerard.example.model.User;
import be.gerard.provider.factory.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserTest
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExampleConfiguration.class)
public class UserTest {

    @Autowired
    private Factory factory;

    @Test
    public void test1() {
        User user = factory.get(User::new);

    }

}
