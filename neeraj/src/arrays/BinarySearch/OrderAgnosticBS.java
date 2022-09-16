package arrays.BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {12,10,8,4,3,2,1,-6};
        int target = 2;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        //find arr is whether ascend or dscending
        boolean isAsc = arr[start] < arr[end];
        int mid = start + (end-start)/2 ;
        if(arr[mid]== target){
            return mid;
        }
        if(isAsc){
           if(target < arr[mid]){
               end = mid-1;
           }else {
               start = mid+1;
           }
        }
        else {
            if(target > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return -1;

    }
}
