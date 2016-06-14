package be.gerard.provider.data;

import be.gerard.value.Value;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * ValueProvider
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class ValueProvider<T extends Value<?>> {

    private final Class<T> type;

    private final Supplier<T> supplier;

    public ValueProvider(Class<T> type, Supplier<T> supplier) {
        this.type = type;
        this.supplier = supplier;
    }

    public Class<T> getType() {
        return type;
    }

    public Supplier<T> getSupplier() {
        return supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ValueProvider<?> that = (ValueProvider<?>) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
