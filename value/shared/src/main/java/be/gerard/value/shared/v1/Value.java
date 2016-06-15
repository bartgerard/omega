package be.gerard.value.shared.v1;

import java.io.Serializable;
import java.util.Objects;

/**
 * ValueObject
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class Value<T extends Serializable> implements Serializable {

    private final T value;

    public Value(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Value<?> that = (Value<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
