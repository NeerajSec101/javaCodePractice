package arrays.TwoD;

import java.util.Scanner;



public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int num[][]=new int[rows][cols];
        //input
        for (int i=0;i<rows;i++){
           for (int j=0;j<cols;j++){
               num[i][j] = sc.nextInt();
           }
        }

        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(num[i][j]==x){
                    System.out.println("found elements are at location :"+"("+ i +"," + j+")");
                }
            }
        }

    }
}
