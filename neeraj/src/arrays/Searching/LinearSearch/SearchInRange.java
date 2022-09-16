package arrays.Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,1,4,3,15,9};
        int target = 9;
        System.out.println(leanerSearch(arr,target,1,5));

    }
    static int leanerSearch(int[] arr,int targt,int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start;index<=end;index++){
            if(arr[index]==targt){
                return index;
            }
        }
        return -1;

    }
}
