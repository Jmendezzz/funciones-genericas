package interfaces;

import java.util.function.Supplier;

public interface Generador<T> {

    Supplier<T> generate();
}
