package practice;

import java.util.HashMap;
import java.util.Map;

public class countingLetterOccurences {
    public static void main (String [] args){
        String name = "Hello Java";
        char[] strArray = name.toCharArray();
        Map<Character, Integer> letterCount = new HashMap<Character, Integer>();
        for(int i=0; i<strArray.length; i++){
            if(letterCount.containsKey(strArray[i])){
                letterCount.put(strArray[i], letterCount.get(strArray[i]) +1);
            } else{
                letterCount.put(strArray[i], 1);
            }
        }
        System.out.println(letterCount);
}}
