package task;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {


        String testString = "Test Automation";
        String lowerCaseString = testString.toLowerCase();

//        int count = 0;

        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i <testString.length(); i++){
            if(lowerCaseString.charAt(i)=='a'||lowerCaseString.charAt(i)=='e'||lowerCaseString.charAt(i)=='i'
                    ||lowerCaseString.charAt(i)=='u'||lowerCaseString.charAt(i)=='o'){
             //   count++;
                vowels.add(lowerCaseString.charAt(i));
            }
        }

        System.out.println(vowels);
        System.out.println(vowels.size());
       //
    }
}
