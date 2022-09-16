package arrays.TwoD;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int []arr = {1,3,2,4,5};
        rever(arr);
        //swap(arr ,1,3);
        System.out.println(Arrays.toString(arr));
    }

    //reverse array
    static void rever(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;

        }

    }
    //SWap values of Array
    static void swap(int arr[],int index1,int index2){
        int temp  =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
