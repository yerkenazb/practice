package mindtek.functionalinterfaces2;

import java.util.*;
import java.util.function.Supplier;

public class LambdaPractice5 {
    /*
    String str = "Java";
    .getOutputWithCondition(str, getOnlyUpperCases); -> return
     */

    public static String getOutputWithCondition(String str, MethodCondition<Character> condition) {
        String output = "";
        for(int i=0; i<str.length(); i++){
            if(condition.execute(str.charAt(i))){
                output+=str.charAt(i);
            }
        }
        return output;

}

        public static List<Integer> getNumsWithCondition(List<Integer> nums, MethodCondition<Integer> condition){
        List<Integer> output = new ArrayList<>(); 
        for(Integer n:nums){
         if(condition.execute(n)){
             output.add(n); 
           }
        }
        return output;
    }


    public static void main(String[] args) {

     //   MethodCondition<Character> onlyUpperCases = x-> Character.isUpperCase(x);

        System.out.println(getOutputWithCondition("Java", x-> Character.isUpperCase(x)));
        System.out.println(getOutputWithCondition("Java", x-> Character.isLowerCase(x)));
        System.out.println(getOutputWithCondition("Java", x -> "ioueaIOUEA".contains(x+"")));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,6, 1,21,16,42));


        System.out.println(getNumsWithCondition(numbers, x-> x%2==0));
        //even numbers between 10 and 20
        System.out.println(getNumsWithCondition(numbers,x-> x%2==0 && x>=10 && x<=20));


        Supplier<Integer> generateRandomNum = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        System.out.println(generateRandomNum.get());

        Supplier<String> generateRandomStr = () -> {
            String str = new Random().nextInt() + "abc";
            return str;
        };

        System.out.println(generateRandomStr.get());
    }
}
