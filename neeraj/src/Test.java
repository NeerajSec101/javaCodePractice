
import java.util.Scanner;

public class Test {
    /*public static int find_min(int[] a,int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];

    }*/
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i= 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }*/
        int a=2, b =4;
        int ans = funn(a,b);


        System.out.println(ans);


    }
    static int funn(int a, int b){
        if((3-b)<(b-a) && (3^b)>(b+a)){
            b = (a+1)+a;
            b = 2+b+b;
            a = 3+2+b;
            return funn(a,b+a);

        }
        b=(b+3)+a;
        return b+1;
    }


}
