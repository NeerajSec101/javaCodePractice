package arrays.TwoD;

import java.util.Scanner;

public class sparialMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int sprialMatrix[][] = new int[r][c];
         for (int i =0;i<r;i++){
             for (int j=0;j<c;j++){
                 sprialMatrix[i][j]=sc.nextInt();
             }
         }

         System.out.println("The Spiral Order Matrix is : ");
         int rowStart = 0;
         int rowEnd = r-1;
         int colStart = 0;
         int colEnd= c-1;

         while (rowStart<=rowEnd && colStart<=colEnd){
             for(c = colStart;c<colEnd;c++){
                 System.out.println(sprialMatrix[rowStart][c]+" ");
             }
             rowStart ++;

             for (r = rowStart;r<rowEnd;r++){
                 System.out.println(sprialMatrix[r][colEnd]+" ");
             }
             colEnd--;

             for (c = colEnd;c>colStart;c--){
                 System.out.println(sprialMatrix[rowEnd][c]);
             }
             rowEnd--;

             for(r=rowEnd;r>rowStart;r--){
                 System.out.println(sprialMatrix[r][colStart]);
             }
             colStart++;

             System.out.println();
         }

    }
}
