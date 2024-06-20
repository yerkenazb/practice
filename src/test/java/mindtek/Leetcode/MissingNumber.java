package mindtek.Leetcode;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber1(int[] nums) {
        //method 1
        int temp = 0;
        Arrays.sort(nums);
        for(int el: nums){
            if(el!=temp)
                return temp;
            temp++;
        }
        return temp;
    }

    public int missingNumber2(int[] nums) {
       //1,2,3  n*(n+1)/2 = 6 -> -0
        // 1,2,0
        int sum =0;
        for(int el:nums){
            sum+=el;
            int n = nums.length;
            int res = (n*(n+1))/2;
            return res-sum;
        }
        return 0;
    }

    public int missingNumber3(int[] nums) {
        //1,2,3  n*(n+1)/2 = 6 -> -0
        // 1,2,0
        int sum =0;
        for(int el:nums){sum+=el;
            return (nums.length*(nums.length+1))/2-sum;
        }
        return 0;
    }

}
