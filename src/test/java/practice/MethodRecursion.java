package practice;

public class MethodRecursion {

    public static String reverse (String str){
        //Step 1: If String
        if(str.length()==1){
            return str;
        }
        //Step 2; get the last character
        char last = str.charAt(str.length()-1);

        //Step 3: Cut last letter from the end
        str = str.substring(0, str.length()-1);

        //Step 4: Return last letter and
        return last + reverse(str);

    }


    public static void main(String [] args){

        String word = "Techtorial";

        System.out.println(reverse(word));
    }
}
