public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,2,3};
        int target = 4;
        int[] rez = new int[2];
        for (int i = 0; i < numbers.length - 1; i ++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    rez[0] = i;
                    rez[1] = j;
                }
            }
        }
        for (int i : rez) {
            System.out.println(i);
        }
    }
}
