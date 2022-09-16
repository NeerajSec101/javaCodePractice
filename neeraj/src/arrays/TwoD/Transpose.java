package arrays.TwoD;


import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c = sc.nextInt();

        int num[][] = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j =0;j<c;j++){
                num[i][j]=sc.nextInt();
            }
        }

        System.out.println("Without Transpose matrix is: ");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("After Transpostion of matrix is: ");
        for(int j = 0;j<c;j++){
            for(int i =0;i<r;i++){
                System.out.println(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
