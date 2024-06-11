package practice;

public class removingDuplicatesString {

    public static void main(String[] args) {

        String word = "Hello";
        String uniqueWord = "";


        for(int i=0; i<word.length(); i++){
           if(!uniqueWord.contains(String.valueOf(word.charAt(i)))) {
               uniqueWord += String.valueOf(word.charAt(i));
           }
        }

        System.out.println(uniqueWord);


    }


}


