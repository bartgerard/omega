package be.gerard.example.mapping;

import be.gerard.example.data.UserData;
import be.gerard.provider.data.ValueProvider;
import be.gerard.provider.mapping.ValueMapping;
import be.gerard.user.shared.v1.value.FirstName;
import be.gerard.user.shared.v1.value.LastName;
import be.gerard.user.shared.v1.value.UserId;
import be.gerard.value.shared.v1.Value;
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
