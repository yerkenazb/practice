package mindtek.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1 = List.of(4,5,1);
        List<Integer> list2 = List.of(3,2);

        listOfList.add(list1);
        listOfList.add(list2);


        //method 1
        List<Integer> numbers = listOfList.stream()
                .flatMap(list -> list.stream())
                .sorted()
                .collect(Collectors.toList());

        List<Integer> numbers2 = new ArrayList<>();

        //method 2
         listOfList.stream()
                .forEach(x -> x.stream().forEach(num -> numbers2.add(num)));

         //method 3
        listOfList.forEach(numbers2::addAll);
        System.out.println(numbers);

        String [] values = {"Today, I have", "learned streams", "and different operations"};

        Object [] words = Arrays.stream(values)
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .toArray();

        System.out.println(Arrays.toString(words));


    }
}
