package practice;

public class TernaryOperators {

    public static void main(String[] args) {

        FizzBuzz(100);
    }

    /*

       FizzBuzz interview question:
       You are given one number, and you have to iterate from 0 till this number
     */
    public static void FizzBuzz (int n){

         for(int i=1; i<=n; i++){
//             if(i%15==0){
//                 System.out.println("FizzBuzz");
//             } else if(i%5==0){
//                 System.out.println("Buzz");
//             } else if(i%3==0){
//                 System.out.println("Fizz");
//             } else {
//                 System.out.println(i);
//             }
//         }

//        if(n==1){
//            System.out.println(n);
//            return n;
//        }
//
        String result = (i%15==0)? "FizzBuzz" : (i%5==0)? "Buzz" : (i%3==0)? "Fizz" : "" +i;
        System.out.println(result);



    }





}}
