package arrays.TwoD;

public class Max {
    public static void main(String[] args) {
        int[] a = {1,32,23,43};
        System.out.println(max(a));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return  maxVal;

    }
}
