package imp;

import interfaces.Generador;

import java.util.function.Supplier;

public class GeneradorImp implements Generador<Double> {
    public GeneradorImp() {


    }

    @Override
    public Supplier<Double> generate() {
        return ()-> (Math.random() * 100) + 1;
    }
}