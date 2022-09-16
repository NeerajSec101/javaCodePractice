package arrays.Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []nums ={12,1,4,5,3,67,-3,-2,45};
        int target  = in.nextInt();
        //int ans = linearSearch(nums,target);
        //int ans = linearSearch2(nums,target);
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);

    }

    //search the target and return the ture or false
    static boolean linearSearch3(int []arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int i:arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    //serach element and return value of search aliement
    /*static int linearSearch2(int []arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i:arr){
            if(i==target){
                return i;
            }
        }
        return -1;
    }*/

    //element not found return -1
    //search element in array and return index of element
    /*static int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }

        for(int index =0;index<arr.length;index++){
            int element = arr[index];
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }*/

}
