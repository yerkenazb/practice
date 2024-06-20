package mindtek.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        int []nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate2(nums));
    }


    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            if(nums[i]==nums[j])
                return true;
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
     Set<Integer> set = new HashSet<>();
     for(int el:nums) set.add(el);
     return nums.length!=set.size();
    }

    public static boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int el:nums) if(!set.add(el)) return true;
        return false;
    }


    public static boolean containsDuplicate4(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<nums.length; i++){
               set.add(nums[i]);
            }
            boolean equals = set.size()!=nums.length;
            return true;
        }

}
