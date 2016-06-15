package be.gerard.user.shared.v1;

import be.gerard.user.shared.v1.model.User;

/**
 * UserService
 *
 * @author bartgerard
 * @version v0.0.1
 */
public interface UserService {

    User findOne(long id);

    void save(User user);

}
