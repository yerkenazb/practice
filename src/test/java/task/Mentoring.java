package task;

import java.util.Arrays;

public class Mentoring {
    public static void main(String[] args) {


        int[] arr = {55, 32, 412, 54, 1, 4, 6, 77, 888, 44};

        int temp = 0;

        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }



}
