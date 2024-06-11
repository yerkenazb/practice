package mindtek.functionalinterfaces;

public class TestFunInterface {
    public static void main(String[] args) {
        Printer p = (str) -> System.out.println("Printing: "+ str);
        p.print("Message");

        Printer p2=(str)-> System.out.println("Running: " + str);
        p2.print("Patel");

        Calculator addition = ( a, b) -> a+b;
        System.out.println(addition.calculate(4, 5));

        Calculator multiplication =(a, b) -> a*b;
        System.out.println(multiplication.calculate(2,3));
        }
    }

