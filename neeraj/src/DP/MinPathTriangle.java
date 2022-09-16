package DP;
/*Given a triangle array, return the minimum path sum from ttop to bottom.
* for each step, you may move to an adjacent number of the row below.
* More formally,if you are on index i on the current row, you may move to either,
* index i or index i+1 on the next row.
*
* input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
* output: 11
* Explanation: the triangle looks like
*     (2)
*   (3) 4
*  6 (5) 7
* 4 (1) 8 3*/

public class MinPathTriangle {
    public static void main(String[] args) {
        int arr[][] = {{-1},{2,3},{1,-1,3}};
        System.out.println(minSumPathInTriangle(arr));


    }
    static int minSumPathInTriangle(int[][] A){
        return helper(A,0,0);

    }
    static int helper(int[][] A,int i,int j){
        if(i==A.length){
            return 0;
        }
        int nm;
        nm = A[i][j] + Math.min(helper(A,i+1,j),helper(A,i+1,j+1));

        return nm;
    }
}
