package mindtek.functionalInterfaces3;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Car car = new Car ("Lamborghini", 2025, "Blue", "Sedan");

        Consumer<Car> printCarModel = x -> System.out.println(x.getModel());

        printCarModel.accept(car);

        BiConsumer<String, Integer> concatenate = (x, y) -> System.out.println((x+y));
        concatenate.accept("Java", 21);


    }
}
