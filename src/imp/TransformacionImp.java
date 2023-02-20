package imp;

import interfaces.Transformacion;

public class TransformacionImp implements Transformacion<Double> {

    public TransformacionImp() {

    }


    @Override
    public void transformar(Double num) {

        num = num*100;

    }
}


