package practice;

public class Task3 {

    public static void main(String[] args) {


        int[] numArray = new int[]{88, 343, 21, 4, 12, 56, 99};

        int temp = 0;

      for(int i=0; i<numArray.length; i++){
          for(int j=i+1; j<numArray.length; j++){
              if(numArray[i]>numArray[j]){
                   temp=numArray[i];
                   numArray[i]=numArray[j];
                   numArray[j]= temp;
              }
          }
      }



      for(int i=0; i<numArray.length; i++){
          System.out.print(numArray[i] + " ");
      }


      int total = 0;

      for(int i=0; i<101; i++){
          total+=i;
      }
        System.out.println(total);
}}