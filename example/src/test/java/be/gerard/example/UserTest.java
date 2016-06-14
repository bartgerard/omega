package be.gerard.example;

import be.gerard.example.config.ExampleConfiguration;
import be.gerard.example.model.User;
import be.gerard.provider.factory.Factory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserTest
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExampleConfiguration.class)
public class UserTest {

    @Autowired
    private Factory factory;

    @Test
    public void test1() {
        User user = factory.get(User::new);

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getFirstName());
        Assert.assertNotNull(user.getLastName());
    }

}
