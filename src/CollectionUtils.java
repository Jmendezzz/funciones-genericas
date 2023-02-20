import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class CollectionUtils {
    List<Integer> lista = new ArrayList<>();


    public static <T,R> List<R> generateData(Supplier<T> function, int limite){

        List<R> newList = new ArrayList<>();
        for(int i=0;i<limite;i++){
            newList.add((R)function.get());
        }
        return newList;
    }

    public static <T> void transformData(List<T> list, Consumer<T> func){
        list.stream()
                .forEach(func::accept);
    }

    public static <T> void doSomethingToList(List<T> list, Consumer<T> func){
        list.stream()
                .forEach(t-> func.accept(t));
    }

    public static  <T> List<T> genericalFilter(List<T> list, Predicate<T> condition){
        return list
                .stream()
                .filter(t->condition.test(t))
                .collect(Collectors.toList());
    }

    public static double reduceList(List<Double> list){
        return  list.stream().reduce(0.0,(total,element) -> total+ element);
    }

}
