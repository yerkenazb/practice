package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueArrayElements {

    public static void main(String[] args) {


        int [] numbers = {1,2,4,1,3,2,43,5,6,3,5,2,4};
        Set<Integer> uniqueNumbers = new LinkedHashSet<Integer>();
        for(Integer x:numbers){
            uniqueNumbers.add(x);
        }
        int count = 0;
        for(Integer x: uniqueNumbers){
            System.out.println(x);
            count++;
        }

        System.out.println("Number of unique numbers is:" + count);
//
//        System.out.println(uniqueNumbers.size());
    }
}
