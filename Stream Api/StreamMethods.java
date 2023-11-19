package StreamApi;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        // Filter --> It takes predicate ... predicate means
        // it takes boolean value function
        // use lamda expression... e--> e>10

        // map(Function)
        /*
         * each element operation
         * 
         */

         List<String> names = List.of("Aman", "Ankit","Abinav","Durgesh");
         // Filter out all the names strating with A
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23,4,2,5,7,4);
        List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        names.stream().forEach(e->{
            System.out.println(e);
        });

        newNames.stream().forEach(System.out::println);

        // Sorted method...
        numbers.stream().sorted().forEach(System.out::println);

        // Min and max

        Integer minNumber = numbers.stream().min((x,y)->x.compareTo(y)).get();

        System.out.println(minNumber);

        Integer maxNumber = numbers.stream().max((x,y)->x.compareTo(y)).get();

        System.out.println(maxNumber);
    }
}
