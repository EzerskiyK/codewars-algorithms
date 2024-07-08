import java.util.Arrays;

public class kass {
    
    public static void main(String[] args) {
        int[] customers = new int[]{10,2,3,3};
        int n = 2;
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        } 
        System.out.println(result[n-1]);
    }
}
