package mindtek.exceptionspractice2;

public class StopFinallyBlock {
    public static void main(String[] args) {

        try{
            int num = 5/1;
            System.out.println(num);
     //      return; // will stop the method after finally being executed
            System.exit(0); //Stops the code without executing finally block;
            return;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In finally block");
        }

        System.out.println("After try catch and finally.");

    }
}
