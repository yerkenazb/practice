package mindtek.functionalInterfaces3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntro {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,1,5,8,3,1,5,5));

        List<Integer> numbers2 = List.of(1, 2,3);

         List<Integer> output = numbers.stream().filter(x -> x>0 && x<5).collect(Collectors.toList());

        System.out.println(output);

         long count = numbers.stream().filter(x-> x%2==1).count();

         System.out.println("Number of odd numbers: " + count);

        List<Integer> uniqueNums = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueNums);

        boolean anyMatch = numbers.stream().anyMatch(x -> x>10 && x<20);
        System.out.println(anyMatch);

        boolean allMatch = numbers.stream().allMatch(x -> x>0 && x<10);

        System.out.println(allMatch);

        String [] names = {"John", "Patel", "Bob", "Charlie"};
        

        Object [] namesWithA = Arrays.stream(names).filter(x->x.contains("a") || x.contains("A")).toArray();

        System.out.println(Arrays.toString(namesWithA));
    }
}
