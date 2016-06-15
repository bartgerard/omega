package be.gerard.value.shared.v1;

import java.io.Serializable;

/**
 * Id
 *
 * @author bartgerard
 * @version v0.0.1
 */
public abstract class Id<T extends Serializable> extends Value<T> {

    public Id(T value) {
        super(value);
    }

}
