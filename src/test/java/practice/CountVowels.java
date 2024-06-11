package practice;

public class CountVowels {

    public static void main(String[] args) {

        // Count the vowels in a given string
        String word = "I love java";
        word= word.toLowerCase();
        String vowels = "aeiuo";
        int count = 0;
        //1
        for(int i=0; i<word.length(); i++){
            if(vowels.contains(word.charAt(i)+ "")){
                count++; } }
        System.out.println(count);
        //2
        for (int i=0; i<word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' ||
                    word.charAt(i)=='i' ||word.charAt(i)=='u' ||word.charAt(i)=='o'){
                count++; } }
        System.out.println(count);







    }

}
