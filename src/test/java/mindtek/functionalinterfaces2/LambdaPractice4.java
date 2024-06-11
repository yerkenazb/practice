package mindtek.functionalinterfaces2;

public class LambdaPractice4 {
    public static void main(String[] args) {
        Checker<Integer, Integer> sum = x ->  {
            Integer total =0;
            for(Integer num: x){
                total+=num;
            }
            return total;
        };

        Integer [] nums = {5,2,6};
        System.out.println(sum.execute(nums));

     //method1
//        Checker<Integer, Boolean> sumMoreThan20 = x ->  {
//            Integer total =0;
//            for(Integer num: x){
//                total+=num;
//            }
//            return total>20;

//method2
            Checker<Integer, Boolean> sumMoreThan20 = x -> sum.execute(x) >20;
            System.out.println(sumMoreThan20.execute(nums));


            /*
            Implement lambda expression for checker that takes array of strings and return all
            elements concatenated.
            Example:
            String [] words = {"I", "love", "Java"};
            concatenate.execute(words); -> return "I love Java";
             */

        //method 1 with String
        String [] words = {"I", "love", "Java"};
        Checker <String, String> concatenate1 = x -> {
            String concatWord = "";
            for(String w: words){
                concatWord+=w + " ";
            }
            return concatWord;
        };


        //method 2 with StringBuilder
        Checker <String, String> concatenate2 = x -> {
            StringBuilder stb = new StringBuilder();
            for(String s: x){
                stb.append(s).append(" ");
            }
            return  stb.toString().trim();
        };

        System.out.println(concatenate1.execute(words));
        System.out.println(concatenate2.execute(words));

        /*
        String [] prices = {"$2.4", "$5.2", "$3"};
        Example:
        getTotal.execute(prices); return 10.6; double
         */

        String [] prices = {"$2.4", "$5.2", "$3"};
        Checker <String, Double> getTotal = x-> {
            Double total = 0.0;
            for(String price: x){
               Double p= Double.valueOf(price.substring(1));
               total+=p;
            }
            return total;
        };

        System.out.println(getTotal.execute(prices));




    };
}
