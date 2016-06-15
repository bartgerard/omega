package be.gerard.user.service.value;

import be.gerard.value.Id;

/**
 * UserId
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class UserIdRecord extends Id<Long> {

    public UserIdRecord(Long value) {
        super(value);
    }

}
