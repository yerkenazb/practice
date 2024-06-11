package mindtek.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args) {

        Parent parent1 = new Parent("John Doe", 'M', new ArrayList<>(List.of("Bob", "Richard", "Michael")));
        Parent parent2 = new Parent("Patel Harsh", 'M', new ArrayList<>(List.of("Srikkanth", "Sumathi", "Suresh")));
        Parent parent3 = new Parent("Kate Peterston", 'F', new ArrayList<>(List.of("Jessica", "Charles")));

        List<Parent> parents = List.of(parent1,parent2, parent3);

        //Store names of children in list of Strings

        List<String> children = parents.stream()
                .flatMap(x->x.getChildren().stream())
                .collect(Collectors.toList());

        System.out.println(children);

        //Get first kid's name into list of every Male parent

        List<String> firstKidOfMaleParents = parents.stream()
                .filter(x->x.getGender()=='M')
                .flatMap(x-> List.of(x.getChildren().get(0)).stream())
                .collect(Collectors.toList());

        System.out.println(firstKidOfMaleParents);

        //get the first name of the parents that children's name starts with 'C'


           parents.stream().
                   filter(x->x.getChildren().stream().filter(child->child.startsWith("C")).count()>=1)
                   .map(x->x.getName().substring(0, x.getName().indexOf(" ")))
                   //map(x -> x.getName().split(" ")[0])
                   .forEach(x-> System.out.println(x));




              //
        //
        //
        //             toString().startsWith("C")).map(Parent::getName).toString();








    }
}
