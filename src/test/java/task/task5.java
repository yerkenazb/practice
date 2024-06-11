package task;

public class task5 {

    public static void main(String[] args) {


        String name = "bob";
        name = name.toLowerCase();

        String empty = "";

        for(int i=name.length()-1; i>=0; i--){
            empty+=name.charAt(i);
        }

        System.out.println(name.equals(empty));

    }
}
