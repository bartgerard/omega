package be.gerard.user.service.model;

import be.gerard.persistence.shared.v1.BaseRecord;
import be.gerard.user.service.value.FirstNameRecord;
import be.gerard.user.service.value.LastNameRecord;
import be.gerard.user.service.value.UsernameRecord;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Entity
@Table(name = "user")
@SequenceGenerator(name = BaseRecord.SEQUENCE_GENERATOR, sequenceName = "s_user", allocationSize = BaseRecord.SEQUENCE_ALLOCATION_SIZE)
public class UserRecord extends BaseRecord {

    @Embedded
    private UsernameRecord username;

    @Embedded
    private FirstNameRecord firstName;

    @Embedded
    private LastNameRecord lastName;

    public UsernameRecord getUsername() {
        return username;
    }

    public void setUsername(UsernameRecord username) {
        this.username = username;
    }

    public FirstNameRecord getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstNameRecord firstName) {
        this.firstName = firstName;
    }

    public LastNameRecord getLastName() {
        return lastName;
    }

    public void setLastName(LastNameRecord lastName) {
        this.lastName = lastName;
    }

}
