package arrays.Searching.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[]= {12,14,11,6,4,3,23};
        System.out.println(min(arr));
    }

    static int min(int []arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
