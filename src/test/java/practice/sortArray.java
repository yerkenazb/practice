package practice;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {

        int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

        int temp = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");

        }

      /*
      int [] arr = {3,534,12,543,775,2,4,72,1,6};
        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));
66jm88
       */



}}