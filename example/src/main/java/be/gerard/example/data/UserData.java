package be.gerard.example.data;

import be.gerard.example.value.FirstName;
import be.gerard.example.value.LastName;
import be.gerard.example.value.UserId;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * UserData
 *
 * @author bartgerard
 * @version v0.0.1
 */
public final class UserData {

    private static final Random RANDOM = new Random();
    private static final DataFactory DATA_FACTORY = new DataFactory();
    private static long userId = 0L;

    private UserData() {
    }

    public static UserId userId() {
        return new UserId(userId++);
    }

    public static FirstName firstName() {
        return new FirstName(DATA_FACTORY.getFirstName());
    }

    public static LastName lastName() {
        return new LastName(DATA_FACTORY.getLastName());
    }

}
