package mindtek.functionalInterfaces3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, "White", "Sedan");
        Car car2 = new Car("Honda", 2024, "Red", "SUV");
        Car car3 = new Car("Mercedes", 2022, "Black", "Sedan");
        Car car4 = new Car("BMW", 2018, "Silver", "SUV");
        Car car5 = new Car("Chevrolet", 2015, "Blue", "SUV");

        List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

        /*
        Get cars models that is from 2020 and later
         */

//        for(Car c: cars){
//            if(c.getYear()>=2020){
//                System.out.println(c.getModel());
//            }
//        }

        getDataFromCars(cars, x->x.getYear()>=2020, Car::getModel);

        /*
        Get colors of SUV cars
         */

//        for(Car c: cars){
//            if(c.getType().equals("SUV")){
//                System.out.println(c.getColor());
//            }
//        }

        getDataFromCars(cars, c -> c.getType().equals("SUV"), Car:: getColor);

        getDataFromCars(cars, c ->c.getType().equals("Sedan"), Car::getYear);

        //Print first 3 letters of Models in Uppercase of SUV cars that are having even number as a  year

        getDataFromCars(cars, c -> c.getType().equals("SUV") && c.getYear()%2==0, c->c.getModel().substring(0,3).toUpperCase());

        //Count SUV cars

        System.out.println("Number of SUV cars: " + getCountOfCars(cars, x -> x.getType().equals("SUV")));
        System.out.println("Number of Sedan cars: " + getCountOfCars(cars, x -> x.getType().equals("Sedan")));
        System.out.println("Number of Black cars: " + getCountOfCars(cars, x -> x.getColor().equals("Black")));
    }

    public static int getCountOfCars (List<Car> cars, CarCondition condition){
        int count =0;
        for(Car c: cars){
            if(condition.applyCondition(c)){
                count++;
            }
        }
        return  count;
    }

    public static void getDataFromCars(List<Car> cars, CarCondition condition, AttributeFunction <Object> function){
        for(Car c: cars){
            if(condition.applyCondition(c)){
                System.out.println(function.get(c));
            }
        }
    }
}

