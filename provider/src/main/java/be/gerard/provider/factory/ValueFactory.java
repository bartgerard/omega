package be.gerard.provider.factory;

import be.gerard.provider.data.ValueProvider;
import be.gerard.provider.mapping.ValueMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * ValueFactory
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Service
public class ValueFactory implements Factory {

    @Autowired
    private ValueMapping mapping;

    private static <T> void setField(Field field, T object, ValueProvider<?> provider) {
        final boolean isAccessible = field.isAccessible();
        field.setAccessible(true);

        try {
            field.set(object, provider.getSupplier().get());
        } catch (IllegalAccessException e) {
            e.printStackTrace(); // TODO
        }

        field.setAccessible(isAccessible);
    }

    @Override
    public <T> void provision(T object) {
        for (Field field : object.getClass().getDeclaredFields()) {
            findByType(field.getType()).ifPresent(provider -> setField(field, object, provider));
        }
    }    private static <T> void setField(Field field, T object, ValueProvider<?> provider) {
        final boolean isAccessible = field.isAccessible();
        field.setAccessible(true);

        try {
            field.set(object, provider.getSupplier().get());
        } catch (IllegalAccessException e) {
            e.printStackTrace(); // TODO
        }

        field.setAccessible(isAccessible);
    }

    protected Optional<ValueProvider<?>> findByType(Class<?> type) {
        Assert.notNull(type, "type is invalid [null]");
        return mapping.mapping().stream()
                .filter(provider -> Objects.equals(provider.getType(), type))
                .collect(Collectors.reducing((a, b) -> null));
    }

}
