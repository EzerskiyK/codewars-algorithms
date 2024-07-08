public class EqualSidesOfAnArray {
    public static void main(String[] args) {
        int[] arr = {20,10,-80,10,10,15,35};
        int sumOfRightNumbers = 0;
        int sumOfLeftNumbers = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                sumOfRightNumbers += arr[j];
            }
            if(sumOfLeftNumbers == sumOfRightNumbers)
            System.out.println(sumOfLeftNumbers + " : " + i + " : " + sumOfRightNumbers);
            sumOfLeftNumbers += arr[i]; 
            sumOfRightNumbers = 0;

        }
    }
}
