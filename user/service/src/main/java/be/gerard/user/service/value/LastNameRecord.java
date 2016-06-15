package be.gerard.user.service.value;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

/**
 * LastName
 *
 * @author bartgerard
 * @version v0.0.1
 */
@AttributeOverride(name = "value", column = @Column(name = "last_name"))
public class LastNameRecord extends NameRecord {

    public LastNameRecord(String value) {
        super(value);
    }

}
