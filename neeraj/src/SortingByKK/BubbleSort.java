package SortingByKK;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        buuble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void buuble(int[] arr){
        //run the step till n-1 times
        for(int i=0;i<arr.length; i++){
            //for each step,max item will came at the last respective index
            for(int j = 1;j< arr.length-i;j++){
                //swap the item, if item is smaller the privious element.
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }

            }
        }
    }
}
