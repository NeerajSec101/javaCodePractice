package arrays.BinarySearch;

import static java.lang.Math.sqrt;

public class mySqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(findSqrt(x));

    }
    static int findSqrt(int x) {
       /* int s = 1;
        int e = x;
        if(x<2)
            return 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int sqr = mid * mid;
            if(x==sqr) {
                return mid;
            }else if(x<sqr) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return e;
    }*/

        int res = (int) Math.floor(Math.sqrt(x));
        return res;
    }
}
