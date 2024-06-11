package mindtek.exceptionspractice2;

public class ErrorPractice {

    public static void method (){
        System.out.println("Running method...");
        method();
    }

    public static void main(String[] args) {
        //Java recommends to Not handle errors
        try {
            method();
        }catch (StackOverflowError e){
            System.out.println("There was an error");

        }
    }



}
