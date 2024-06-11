package task;

import java.util.Arrays;

public class Mentorings {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int [] sumArr = new int [arr.length];

        int value = 0;

        for(int j=0; j<arr.length; j++){
            value+=arr[j];
            sumArr[j]=value;
        }

        System.out.println(Arrays.toString(sumArr));

    }
}
