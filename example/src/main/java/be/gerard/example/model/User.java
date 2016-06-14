package be.gerard.example.model;

import be.gerard.example.value.FirstName;
import be.gerard.example.value.LastName;
import be.gerard.example.value.UserId;
import be.gerard.example.value.Username;

/**
 * User
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class User {

    private UserId id;

    private Username username;

    private FirstName firstName;

    private LastName lastName;

    public UserId getId() {
        return id;
    }

    public void setId(UserId id) {
        this.id = id;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
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
