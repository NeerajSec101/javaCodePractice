package arrays.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-5,-4,0,2,4,6,8,12,26,22,36,40};
        int target = 26;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
