package StreamApi;
import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamApi{

    public static void main(String[] args) {
        // Create a list and filter all the even numbers from list..

        List<Integer> list1 = List.of(2,4,50,21,22,67);
        
        // list1.add(50); this operation can't be done because the above list is immutable

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(21);
        list2.add(23);
        list2.add(25);

        // List<Integer> list3 = Arrays.asList(23,567,12,677,24);

        // System.out.println(list2);

        // List1
        // Without stream

        ArrayList<Integer> listEven = new ArrayList<>();

        for(Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        // The above code is boiler plate code which is long code
        // we can reduce that by stream Api

        // using stream

        Stream<Integer> stream = list1.stream();
        List<Integer> newList1 = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList1); 

        // same code above one...
        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);


        List<Integer> list = list1.stream().filter(i-> i>10).collect(Collectors.toList());
        System.out.println(list);
    }
}
