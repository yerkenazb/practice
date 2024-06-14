package mindtek.collections;

import java.util.ArrayList;
import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(isValid("(]"));

    }


        public static boolean isValid(String s) {

           //if opening then put into the stack
            // else get the element from stack and check types
            //if types match then continue
            //else return false

         Stack <Character> stack = new Stack<>();

         for(int i=0; i<s.length(); i++){
             char par = s.charAt(i);
             if(par=='('|| par =='[' || par =='{') stack.push(par);
             else {
                 if(stack.isEmpty()) return false;
                 char el = stack.pop();
                 if(par == ')' && el != '(' || par == ']' && el != '[' ||par == '}' && el != '{' ) return false;
             }
         }
         return stack.isEmpty();

        }
    }


