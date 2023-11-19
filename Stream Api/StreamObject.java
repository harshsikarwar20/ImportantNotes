package StreamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        
        // Stream API - Collection process...
        // Collection / group of objects 

        // 1--> blank...Stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        // 2--> Array , object , collection...
        String[] name = {"Harsh", "Durgesh" , "Divya" , "Ankit" , "Uttam"};
        Stream<String> stream1 = Stream.of(name);

        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 --> builder pattern...
        // Stream<Object> streamBuilder = Stream.builder().build();

        // 4-->
        IntStream stream = Arrays.stream(new int[]{2,4,65,3,564});
        stream.forEach(e->{
            System.out.println(e);
        });

        // 5 --> List , set
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(21);
        list2.add(23);
        list2.add(25);

        Stream<Integer> Stream2 = list2.stream();
        Stream2.forEach(e->{
            System.out.println(e);
        });

        
    }
}
