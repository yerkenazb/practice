package task;

public class removeDupilcates {
    public static void main(String[] args) {

        //remove duplicate letters from the string

        String word = "Hello World";
        word = word.toLowerCase();
        String uniqueLetters = "";

        for(int i=0; i<word.length(); i++){
          if(!uniqueLetters.contains(word.charAt(i) + "")){
              uniqueLetters+=word.charAt(i);
            }
        }

        System.out.println(uniqueLetters);

    }
}
