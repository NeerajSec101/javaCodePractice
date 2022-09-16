package arrays;
//https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayOfPermutation {
    public static void main(String[] args) {
        int []arr = {5,0,1,2,3,4};
        int []res = buildArray(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] buildArray(int[] nums){
        int []ans = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            ans[i]=nums[nums[i]];

        }
        return ans;
    }
}
