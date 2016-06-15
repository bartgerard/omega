package be.gerard.user.service;

import be.gerard.user.config.UserConfig;
import be.gerard.user.service.dao.UserDao;
import be.gerard.user.service.model.UserRecord;
import be.gerard.user.service.value.FirstNameRecord;
import be.gerard.user.service.value.LastNameRecord;
import be.gerard.user.service.value.UsernameRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserDaoTest
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UserConfig.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test1() {
        UserRecord user1 = new UserRecord();
        user1.setUsername(new UsernameRecord("bart.gerard"));
        user1.setFirstName(new FirstNameRecord("Bart"));
        user1.setLastName(new LastNameRecord("Gerard"));

        UserRecord user2 = userDao.save(user1);

        Assert.assertNotNull(user2.getId());
        Assert.assertEquals(user1.getUsername(), user2.getUsername());
        Assert.assertEquals(user1.getFirstName(), user2.getFirstName());
        Assert.assertEquals(user1.getLastName(), user2.getLastName());

        System.out.println(user2.getCreationTime());
    }

}
