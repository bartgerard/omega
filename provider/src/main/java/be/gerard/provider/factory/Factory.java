package be.gerard.provider.factory;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Factory
 *
 * @author bartgerard
 * @version v0.0.1
 */
public interface Factory {

    <T> void provision(T object);

    default <T> T create(Supplier<T> base) {
        T object = base.get();

        provision(object);

        return object;
    }

    default <T> T get(Supplier<T> base) {
        return create(base);
    }

    default <T> List<T> get(Supplier<T> base, int number) {
        return IntStream.iterate(0, i -> i + 1)
                .limit(number)
                .mapToObj(i -> get(base))
                .collect(Collectors.toList());
    }

}
