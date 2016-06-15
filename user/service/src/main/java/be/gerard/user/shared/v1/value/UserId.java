package be.gerard.user.shared.v1.value;

import be.gerard.value.Id;

/**
 * UserId
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class UserId extends Id<Long> {

    public UserId(Long value) {
        super(value);
    }

}
