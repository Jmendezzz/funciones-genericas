import enums.FiltroEnum;
import enums.GeneradorEnum;
import enums.TransformacionEnum;
import imp.FiltroImp;
import imp.GeneradorImp;
import imp.TransformacionImp;
import interfaces.Filtro;
import interfaces.Generador;
import interfaces.Transformacion;

public class OperationFactory {


    public static Filtro getFiltroOperations(FiltroEnum filtroEnum){
        return switch (filtroEnum){
            case FILTRO_NUMEROS -> new FiltroImp();
        };
    }

    public static Generador getGeneradorOperations(GeneradorEnum generadorEnum){
        return  switch (generadorEnum){
            case GENERADOR_NUMEROS -> new GeneradorImp();
        };
    }
    public  static Transformacion getTransformaacionOperations(TransformacionEnum transformacionEnum){
        return  switch (transformacionEnum){
            case TRANSFORMACION_NUMEROS -> new TransformacionImp();
        };
    }
}
