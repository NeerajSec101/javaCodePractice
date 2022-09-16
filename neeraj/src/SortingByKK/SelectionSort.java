package SortingByKK;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {32,0,-45,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++) {
            //find the maximum item in the array and swaap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);


        }
    }

    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;

    }

    static void swap(int[] arr,int first, int last){
        int tmp = arr[first];
        arr[first] = arr[last];
        arr[last] = tmp;
    }
}
