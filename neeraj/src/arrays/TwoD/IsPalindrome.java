package arrays.TwoD;

public class IsPalindrome {
    public static void main(String[] args) {
        int num = 12;
        boolean res = isPalindrome(num);
        System.out.println(res);


    }
    static boolean isPalindrome(int nums){
        String str = String.valueOf(nums);
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
            return true;
        else return false;

    }
}
