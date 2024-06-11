package mindtek;



import java.util.ArrayList;
import java.util.List;

public class GetSumWithTarget {

    public static Object [] getSumMethod1 (int [] nums, int target){
        int sum=0;

        boolean isGreater = true;

        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<=target && nums[i]<=target && nums[i]!=nums[j]){
                    sum=nums[j]+nums[i];
                }
            }
            if(sum<target){
                isGreater=false;
            }
        }
        System.out.println(sum);
        Object [] o = {sum, isGreater};

    return o;
    }

    public static Object [] getSumMethod2 (int [] num, int target){
        List<Integer> listOf = new ArrayList<>();
        int uniqueNumbers = 0;
        int totalSum=0;

        for(int i=0; i<num.length; i++){
            totalSum+=num[i];
            if(num[i]<=target && !listOf.contains(num[i])){
                uniqueNumbers+=num[i];
                listOf.add(num[i]);
            }
        }

        boolean greaterThanTarget= uniqueNumbers<target;
        if(greaterThanTarget){
            return new Object[]{uniqueNumbers, true};
        } else {
            return  new Object[]{totalSum, false};
        }


    }





    public static void main(String[] args) {
        int [] nums1 = {5, 2, 1, -5, -7, -14, 4, 3, 3};
        int [] num2 = {7, 8, 5,1,-4, -4, -4, 11, 6,};
        getSumMethod1(nums1, 3);
    }




    }



