package be.gerard.user.service.value;

import be.gerard.value.service.IdRecord;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

/**
 * UserId
 *
 * @author bartgerard
 * @version v0.0.1
 */
@AttributeOverride(name = "id", column = @Column(name = "user_id"))
public class UserIdRecord extends IdRecord {

    public UserIdRecord(Long value) {
        super(value);
    }

}
