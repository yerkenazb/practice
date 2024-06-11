package task;

public class task1 {
    public static void main(String[] args) {



        String name = "Yerkenaz";

        System.out.println(isPalindrome(name));


//        String nameReverse = "";
//
//        for(int i=name.length()-1;  i>=0; i--){
//            nameReverse+=name.charAt(i);
//        }
//
//        System.out.println(nameReverse);
//        System.out.println(name.equals(nameReverse));


    }


    public static boolean isPalindrome (String name) {

        String nameReverse = "";

        for(int i=name.length()-1;  i>=0; i--){
            nameReverse+=name.charAt(i);
        }

        return  name.equals(nameReverse);


    }
}
