import java.util.Arrays;
import java.util.Random;

public class CountingSort {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        fullRandom(arr);
        System.out.println(Arrays.toString(arr));
        countingSort(arr,10);
        System.out.println("=============");
        System.out.println(Arrays.toString(arr));
    }

    private static void fullRandom(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(11);
        }
    }

    private static void countingSort(int[] arr, int maxValue){
        int[] countArr = new int[maxValue];
        for(int i = 0; i < maxValue; i++){
            countArr[arr[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < countArr.length; j++){
                if(countArr[j]>0){
                    arr[i] = j;
                    countArr[j]--;
                    break;
                }
            }
        }
    }
}
