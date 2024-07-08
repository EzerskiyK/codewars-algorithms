import java.util.Arrays;
public class TribonacciSequence {
    public static void main(String[] args) {
        double[] s = {0,0,1};
        int n = 10;
        double[] res = Arrays.copyOf(s, n);
        for(int i = 3; i < res.length; i++){
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
        }
       
        for (double d : res) {
            System.out.println(d);
        }

    }
}
