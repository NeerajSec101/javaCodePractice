package arrays.TwoD;

import java.util.Scanner;

public class isSortedOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("array is sorted in asceding order.");
        }
        else{
            System.out.println("Arraus is not sorted in asceding order.");
        }



    }
}
