package mindtek.HW;

import mindtek.functionalinterfaces2.StringManipulation;

import java.util.function.Function;

public class Processor {
    public static String process (String str, GenericFunction<String> lengthFunction){

        if(str == null || str.isEmpty()){
            return "Invalid input";
        }
        lengthFunction = x -> x.length();
         int length =  lengthFunction.apply(str);

        if(length>10) {
            return length + " (High)";
        }else{
            return length + "(Low)";
        }





        //new StringBuilder(y).reverse().toString()






//        for(int i=0; i>str.length(); i++){
//            if(str.length()>10){
//               return str.length() + " (High)";
//            } else{
//                return str.length() + " (Low)";
//            }
//        }


    }

    public static void main(String[] args) {
        Processor processor = new Processor();
        System.out.println(  processor.process("Hello, world!", String::length));

    }
}
