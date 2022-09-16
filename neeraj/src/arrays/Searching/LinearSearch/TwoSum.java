package arrays.Searching.LinearSearch;
/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int j;
        int[] arr = {2,2,2,3};
        if((arr[2]+arr[3])>(arr[3]-arr[2])){
            arr[1] = (1+9)+arr[1];
        }else {
            arr[3] = 5 + arr[2];
            arr[0] = 4 + arr[3];
        }
        arr[0] = (arr[2]+arr[2])+arr[1];
        System.out.println(arr[0]+arr[3]);
        //int target = 6;
        //int[] ans = twoSum(arr,target);
        //System.out.println(Arrays.toString(ans));

    }
    /*static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int comp = target - arr[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }*/

}
