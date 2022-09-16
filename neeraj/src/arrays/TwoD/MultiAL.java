package arrays.TwoD;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lst  = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Initialize
        for(int i=0;i<3;i++){
            lst.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                lst.get(i).add(in.nextInt());
            }
        }
        System.out.println(lst);
    }

}
