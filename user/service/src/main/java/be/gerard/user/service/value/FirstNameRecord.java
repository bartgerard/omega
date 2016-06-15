package be.gerard.user.service.value;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

/**
 * FirstName
 *
 * @author bartgerard
 * @version v0.0.1
 */
@AttributeOverride(name = "value", column = @Column(name = "first_name"))
public class FirstNameRecord extends NameRecord {

    public FirstNameRecord(String value) {
        super(value);
    }

}
