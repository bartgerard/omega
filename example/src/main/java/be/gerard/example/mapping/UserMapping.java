package be.gerard.example.mapping;

import be.gerard.example.data.UserData;
import be.gerard.example.value.FirstName;
import be.gerard.example.value.LastName;
import be.gerard.example.value.UserId;
import be.gerard.provider.data.ValueProvider;
import be.gerard.provider.mapping.ValueMapping;
import be.gerard.value.Value;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * UserMapping
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Component
public class UserMapping implements ValueMapping {

    @Override
    public Set<ValueProvider<? extends Value<?>>> mapping() {
        Set<ValueProvider<? extends Value<?>>> mapping = new HashSet<>();

        mapping.add(new ValueProvider<>(UserId.class, UserData::userId));
        mapping.add(new ValueProvider<>(FirstName.class, UserData::firstName));
        mapping.add(new ValueProvider<>(LastName.class, UserData::lastName));

        return mapping;
    }

}
