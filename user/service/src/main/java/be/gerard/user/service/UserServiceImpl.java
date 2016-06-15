package be.gerard.user.service;

import be.gerard.user.service.dao.UserDao;
import be.gerard.user.service.mapping.UserMapper;
import be.gerard.user.service.model.UserRecord;
import be.gerard.user.shared.v1.UserService;
import be.gerard.user.shared.v1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findOne(long id) {
        return UserMapper.INSTANCE.convert(userDao.findOne(id));
    }

    public void save(User user) {
        UserRecord userRecord = UserMapper.INSTANCE.convert(user);
        userDao.save(userRecord);
    }

}
