package be.gerard.provider.mapping;

import be.gerard.provider.data.ValueProvider;
import be.gerard.value.Value;

import java.util.Set;

/**
 * ValueMapping
 *
 * @author bartgerard
 * @version v0.0.1
 */
public interface ValueMapping {

    Set<ValueProvider<? extends Value<?>>> mapping();

}
