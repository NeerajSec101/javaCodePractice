package arrays.TwoD;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i<size;i++){
            numbers[i] =sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println("index of x:"+i);
            }

        }
    }
}
