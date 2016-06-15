package be.gerard.user.service.model;

import be.gerard.user.service.value.FirstNameRecord;
import be.gerard.user.service.value.LastNameRecord;
import be.gerard.user.service.value.UserIdRecord;
import be.gerard.user.service.value.UsernameRecord;

/**
 * User
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class UserRecord {

    private UserIdRecord id;

    private UsernameRecord username;

    private FirstNameRecord firstName;

    private LastNameRecord lastName;

    public UserIdRecord getId() {
        return id;
    }

    public void setId(UserIdRecord id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", id=" + id +
                ", username=" + username +
                '}';
    }

}
