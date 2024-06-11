package mindtek.functionalinterfaces2;

public class LambdaPractice2 {
    public static void main(String[] args) {

        BiStringManipulation sameLength = (x,y) -> x.length() == y.length();
        System.out.println(sameLength.execute("Java", "Lava"));


        BiStringManipulation isReversed = (x, y) -> x.equalsIgnoreCase(new StringBuilder(y).reverse().toString());

        System.out.println(isReversed.execute("Java", "avaj"));

            }
        }


