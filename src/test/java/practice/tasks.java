package practice;

import java.util.Arrays;
import java.util.Scanner;

public class tasks {


    public static void main(String[] args) {



//      String name = "Yerkenaz";
//
//      String reverseName = "";
//
//      for(int i=name.length()-1; i>=0; i--){
//          reverseName += name.charAt(i);
//      }
//
//      System.out.println(reverseName);
//
//    }

//        int number = 10;
//        int num1 = 0;
//        int num2 = 1;
//        int counter = 0;
//
//        while (counter<number){
//
//            System.out.println(num1 + " ");  //0 /1 /1
//            int num3 = num2 + num1; //1 / 2 /3
//            num1 = num2 ; //1 /1 2
//            num2 = num3; //1 //2 /3
//            counter += 1; //1 /2


        for(int i =1; i<30; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i+ " ");
        }


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//
//        int origNum = num;
//        int rev = 0;
//
//        while (num > 0) {
//            rev = rev * 10 + num % 10; //9
//            num = num / 10;  //8.9
//
//        }
//        System.out.println(rev);
//
//
//        if (origNum == rev) {
//            System.out.println("It is a palindrom number");
//        } else
//            System.out.println("It is not  a palindrom number");


            String man = "Steve Jobs";
            String manWithoutSpace = man.replace(" ", "");

             int count =0;

             for(int i=0; i<manWithoutSpace.length(); i++){
                 count++;
             }

        System.out.println(count);


             int count1 =0;
             for(int i=0; i<man.length(); i++){
                 if(man.charAt(i)!= ' ')
                     count1++;
             }
        System.out.println(count1);
    }
    }








