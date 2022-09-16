package arrays.TwoD;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> lst = new ArrayList<>(10);

        for(int i=0;i<=5;i++){
            lst.add(in.nextInt());
        }

        for(int i=0;i<=5;i++){
            System.out.println(lst.get(i));
        }
        System.out.println(lst);

    }
}
