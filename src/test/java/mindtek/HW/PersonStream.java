package mindtek.HW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStream {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 28, Arrays.asList(new Address("New York", "USA"), new Address("Boston", "USA"))),
                new Person("Jane", 22, Arrays.asList(new Address("London", "UK"), new Address("Manchester", "UK"))),
                new Person("Alice", 35, Arrays.asList(new Address("Sydney", "Australia"))),
                new Person("Bob", 40, Arrays.asList(new Address("Paris", "France"), new Address("Lyon", "France")))
        );

        //Filter people older than 30 years.
        Stream<Person> pplOver30 = persons.stream().filter(x -> x.getAge()>30);
        pplOver30.forEach(System.out::println);

        //Collect the names of all people into a list.
        List<String> allNames = persons.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(allNames);

        //Flatten the list of addresses into a list of cities.
        List<String> addresses = persons.stream()
                .flatMap(x->x.getAddresses().stream())
                .map(Address::getCity)
                .collect(Collectors.toList());
        System.out.println(addresses);

        //Count the number of unique countries in the list of addresses.
        long numUniqueCountries = persons.stream()
                .flatMap(x->x.getAddresses().stream())
                .map(Address::getCountry)
                .distinct().count();
        System.out.println(numUniqueCountries);





    }

}
