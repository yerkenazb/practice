package mindtek.functionalinterfaces2;

public class LambdaPractice {
    public static void main(String[] args) {

        StringManipulation stringMan = (x) -> x.toUpperCase();
        System.out.println(stringMan.execute("java"));

        StringManipulation strMan2 = (x) -> "" + x.charAt(0) + x.charAt(x.length()-1);
        System.out.println(strMan2.execute("Mindtek"));

        StringManipulation strMan3 = (x) -> {
            if(x.length()>=5) {
                return x.toUpperCase();
            }else{
                return x.toLowerCase();
            }
            };

        System.out.println(strMan3.execute("lambda"));
        }


    }


