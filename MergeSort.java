import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fullRandom(arr);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("=============");
        System.out.println(Arrays.toString(arr));
    }

    private static void fullRandom(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(11);
        }
    }

    private static void mergeSort(int[] arr){
        int[] sortedArr = new int[arr.length];
        mergeSort(arr,0, arr.length-1, sortedArr);
    }


    private static void mergeSort(int[] arr, int leftStart, int rigthEnd,int[] sortedArr){
        if(leftStart >= rigthEnd) return;

        int mid = (leftStart + rigthEnd) / 2;
        mergeSort(arr, leftStart, mid, sortedArr);
        mergeSort(arr, mid + 1, rigthEnd, sortedArr);
        merge(arr,leftStart, mid , rigthEnd, sortedArr);
    }
    private static void merge(int[] arr, int leftStart, int mid, int rigthEnd , int[] sortedArr ){
        int leftIndex = leftStart;
        int rigthIndex = mid + 1;
    
        for(int i = leftStart; i <= rigthEnd; i++){
            if(leftIndex <= mid && rigthIndex <=rigthEnd){
                sortedArr[i] = arr[leftIndex] > arr[rigthIndex] ? arr[rigthIndex++] : arr[leftIndex++]; 
            } else {
                sortedArr[i] = leftIndex > mid ? arr[rigthIndex++] : arr[leftIndex++]; 
            }
        }

        for(int i = leftStart; i <= rigthEnd; i++){
            arr[i] = sortedArr[i]; 
        }
        
    }
}
