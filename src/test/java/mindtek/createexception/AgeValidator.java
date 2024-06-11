package mindtek.createexception;

public class AgeValidator {
    public static void validateAge (int age) throws  InvalidAgeException{
        if(age>=0 && age <=150){
            System.out.println("Valid age");
        } else{
            throw new InvalidAgeException("Invalid age. Age should between 0 and 150 years.");
        }
    }

    public static void main(String[] args) {
        validateAge(151);
    }
}
