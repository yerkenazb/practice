package task;

public class StringLetterSearch {
    public static void main(String[] args) {

        String str = "my name is grandma";// DO NOT wright this line in hackerRank
        // replace "str" on what comes from hackerRank method parameter()
        // for example: "s" or "input1"
        //start from here and replace "str" on what comes from hackerRank method parameter(),for example: "s" or "input1"
        str = str.replace(" ", "");
        int count = 0;
        int first = 0;
        int last = 0;
        boolean isFind = false;
        int result;
        for (int i = 0; i < str.length(); i++) {
            boolean equals = str.startsWith("a", i);
            if (!isFind) {
                if (equals) {
                    first = i;
                    isFind = true;
                }
            }
            if (isFind) {
                if (equals) {
                    last = i;
                    count++;
                }
            }
        }
        result = ((last - first) - 1) - (count - 1);
//        return result; WRIGHT THIS LINE WITHOUT TWO SLASHES-- IT IS YOUR RETURN
        System.out.println(result);// DO NOT wright this line of code
    }
}