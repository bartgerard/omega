package be.gerard.user.service.value;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

/**
 * UserName
 *
 * @author bartgerard
 * @version v0.0.1
 */
@AttributeOverride(name = "value", column = @Column(name = "username"))
public class UsernameRecord extends NameRecord {

    public UsernameRecord(String value) {
        super(value);
    }

}
