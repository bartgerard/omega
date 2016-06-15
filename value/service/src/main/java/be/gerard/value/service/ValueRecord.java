package be.gerard.value.service;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * ValueObject
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Embeddable
public class ValueRecord<T extends Serializable> implements Serializable {

    @Column(name = "value")
    private final T value;

    public ValueRecord(T value) {
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

        ValueRecord<?> that = (ValueRecord<?>) o;
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
