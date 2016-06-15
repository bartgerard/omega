package be.gerard.user.service.dao;

import be.gerard.user.service.model.UserRecord;
import be.gerard.user.service.value.UserIdRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserDao
 *
 * @author bartgerard
 * @version v0.0.1
 */
public interface UserDao extends JpaRepository<UserRecord, UserIdRecord> {
}
