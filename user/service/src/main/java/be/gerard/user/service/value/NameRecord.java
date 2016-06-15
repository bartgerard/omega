package be.gerard.user.service.value;

import be.gerard.value.service.ValueRecord;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

/**
 * Name
 *
 * @author bartgerard
 * @version v0.0.1
 */
@AttributeOverride(name = "value", column = @Column(name = "name"))
public abstract class NameRecord extends ValueRecord<String> {

    public NameRecord(String value) {
        super(value);
    }

}
