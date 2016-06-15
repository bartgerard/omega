package be.gerard.persistence.shared.v1;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Objects;

/**
 * SimpleBasedRecord
 *
 * @author bartgerard
 * @version v0.0.1
 */
@MappedSuperclass
public class SimpleBaseRecord implements Serializable {

    public static final String SEQUENCE_GENERATOR = "sequence_generator";

    public static final int SEQUENCE_ALLOCATION_SIZE = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = SEQUENCE_GENERATOR)
    private Long id;

    @Version
    private long version;

    public SimpleBaseRecord() {
    }

    public SimpleBaseRecord(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SimpleBaseRecord that = (SimpleBaseRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%s {id=%d}", getClass().getSimpleName(), id);
    }

}
