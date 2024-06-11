package mindtek.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Blue", "White", "Black", "Green", "Pink");

        Stream<String> stream = colors.stream();

        Stream<String> sortedColors = stream
                .filter(color -> color.startsWith("B"))
                .sorted();
        List<String> output = sortedColors.filter(color -> color.contains("a"))
                .collect(Collectors.toList());

        System.out.println(output);

       List<Integer> length=  colors.stream()
                .map(color -> color.length())
                .collect(Collectors.toList());

       boolean result = colors.stream()
               .filter(x ->x.length()==5)
               .anyMatch(x-> x.contains("b"));

       boolean result2 =  colors.stream()
                .filter(x -> x.length() == 4)
                .noneMatch(x -> x.toLowerCase().contains("b"));

        Integer max = colors.stream()
                .map(x -> x.length())
                .max(Integer::compareTo).get();
        System.out.println(max);


        Integer min = colors.stream()
                .map(x ->x.length())  //.map(String::length)
                //min((x,y) -> x.compareTo(y))
                .min(Integer::compareTo).get();

        System.out.println(min);

        colors.forEach(System.out::println);
              //  .forEach(x -> System.out.println(x));

    }
}
