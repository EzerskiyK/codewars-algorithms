
import java.util.Arrays;
public class SortTheOdd {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int oddArrayLength = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 !=0 ){
            oddArrayLength++;
            }
        }
        int[] oddSorted = new int[oddArrayLength];
        for(int i = 0, j = 0; i < numbers.length; i++){
            if(numbers[i]%2 != 0 ){
                oddSorted[j] = numbers[i];
                j++;
            }
        }
        Arrays.sort(oddSorted);

            for (int i = 0, j = 0; i < numbers.length; i++){
             
            if(numbers[i] % 2 != 0){
                numbers[i] = oddSorted[j];
                j++;
            }
        }

        System.out.println("Результат");
        for (int i : numbers) {
            System.out.println(i);
            
        }

    }
}
