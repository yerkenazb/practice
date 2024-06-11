package practice;


import java.util.Arrays;

public class SumofArray {

    public static void main(String[] args) {

        int [] num = {1,2,3,4};
        int [] sumNum = new int [num.length];
        int value = 0;

        for(int i=0; i<num.length; i++){
            value+=num[i];
            sumNum[i]=value;
        }

        System.out.println(Arrays.toString(sumNum));


    }
}
