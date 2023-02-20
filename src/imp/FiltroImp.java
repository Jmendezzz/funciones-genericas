package imp;

import interfaces.Filtro;

public class FiltroImp  implements Filtro<Double> {


    public FiltroImp(){

    }




    @Override
    public boolean validation(Double num) {
        return num>30;
    }
}
