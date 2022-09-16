package sortingBySradhaKhapra;

public class BubbleSort {

    //time complexity O(n^2)
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,3,1};

        for (int i=0;i<arr.length-1;i++){//n-1
            for (int j=0;j<arr.length-i-1;j++){//n-i-1
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}