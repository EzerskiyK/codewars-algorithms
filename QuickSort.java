public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {60,1,3,8,0,13,137,84,0};
        quickSort(arr);
        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int leftStart, int rigthEnd){
        if(leftStart >= rigthEnd) return;
        int pivotLocation = leftStart + (rigthEnd - leftStart) / 2;
        pivotLocation = orderItemsAroundPivot(arr, leftStart, pivotLocation, rigthEnd);
        quickSort(arr, leftStart, pivotLocation-1);
        quickSort(arr, pivotLocation + 1, rigthEnd);
    }
    private static int orderItemsAroundPivot(int[] arr, int leftStart,int pivotLocation ,int rigthEnd){
        int pivot = arr[pivotLocation];
        swap(arr, pivotLocation, rigthEnd);
        int leftIndex = leftStart;
        int rigthIndex = rigthEnd - 1;
        while(leftIndex <= rigthIndex){
            if(arr[leftIndex] <= pivot){
                leftIndex++;
                continue;
            }
            if(arr[rigthIndex] >= pivot){
                rigthIndex--;
                continue;
            }
            swap(arr, leftIndex, rigthIndex);
        }
        swap(arr, rigthEnd, leftIndex);
        return leftIndex;

    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    
}
