package mindtek;


public class getSum {
    public static void main(String[] args) {

        /*
    Write a method that accepts String as parameter and returns sum of all numbers in String.

    Example:
   .getSum("a12b2mn10"); return 24;  12+2+10=24
   .getSum("123u6i009"); return 138;  123+6+9=138


         */

        String string1 = "a120b2mn10";
        System.out.println(getSum(string1));



    }

    public static int getSum (String word){



        int num =0;
        int sum=0;

        for(int i=0; i<word.length(); i++){
            //   if(string1.charAt(i)<=57 && string1.charAt(i)>=48){
            if(Character.isDigit(word.charAt(i))){
                num=num * 10 + word.charAt(i) - '0';
                //  num = Character.getNumericValue(string1.charAt(i));
            } else{
                sum+=num;
                num=0;

            }
        }
        sum+=num;
        System.out.println(sum);
        return  sum;

    }



}
