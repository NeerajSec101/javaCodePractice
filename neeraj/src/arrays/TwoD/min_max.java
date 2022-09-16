package arrays.TwoD;


import java.util.Scanner;

//Find the maximum & minimum number in an array of integers.
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for(int i=0;i<number.length;i++){
            number[i] = sc.nextInt();
        }

        int min = number[0];
        int max = number[0];

        for(int i=0;i<number.length;i++){
            if(number[i]< min){
                min = number[i];
            }
            if(number[i]>max){
                max = number[i];
            }

        }
        System.out.println("Min value is: "+min);
        System.out.println("Max value is: "+max);
    }
}
