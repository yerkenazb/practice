package practice;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int number = 20;
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < number) {

            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
        }
    }
}