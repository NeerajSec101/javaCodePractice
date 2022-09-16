package arrays.TwoD;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        //input
        //row
        for(int i=0;i<row;i++){
            for(int j =0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //out
        for (int i =0;i<row;i++){
            for (int j=0;j<cols;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
