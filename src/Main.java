import enums.FiltroEnum;
import enums.GeneradorEnum;
import enums.Operation;
import enums.TransformacionEnum;
import interfaces.Filtro;
import interfaces.Generador;
import interfaces.Transformacion;

import java.util.List;
public class Main {


    public static void main(String[] args) {



        List<Double> listNumeros= CollectionUtils.generateData(getGeneradorOperations().generate(),3); //1

        CollectionUtils.transformData(listNumeros, valor->getTransformacionOperations().transformar(valor)); //2

        System.out.println("######### LISTA GENERADA ###########");

        CollectionUtils.doSomethingToList(listNumeros, System.out::println); //3

        System.out.println("######## LISTA FILTRADA ############");

        List<Double> filteredList= CollectionUtils.genericalFilter(listNumeros,v->getFiltroOperations().validation(v)); //4

        CollectionUtils.doSomethingToList(filteredList, System.out::println);

        System.out.println("###### REDUCE A LISTA ORIGINAL ########");


        System.out.println(CollectionUtils.reduceList(listNumeros));




    }
    public static Filtro getFiltroOperations(){
        return  OperationFactory.getFiltroOperations(FiltroEnum.FILTRO_NUMEROS);
    }

    public static Generador getGeneradorOperations(){
        return  OperationFactory.getGeneradorOperations(GeneradorEnum.GENERADOR_NUMEROS);
    }
    public static Transformacion getTransformacionOperations(){
        return OperationFactory.getTransformaacionOperations(TransformacionEnum.TRANSFORMACION_NUMEROS);
    }

}