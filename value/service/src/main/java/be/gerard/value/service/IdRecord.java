package be.gerard.value.service;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * Id
 *
 * @author bartgerard
 * @version v0.0.1
 */
public abstract class IdRecord implements Serializable {

    @Column(name = "id")
    private final Long id;

    public IdRecord(Long id) {
        this.id = id;
    }

    public Long get() {
        return id;
    }

}
