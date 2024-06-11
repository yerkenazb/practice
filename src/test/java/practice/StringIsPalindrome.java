package practice;


import java.util.Scanner;

public class StringIsPalindrome {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a word:");
        String word = input.next();



        String reversed = "";

        for(int i=word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));

      






    }
}
