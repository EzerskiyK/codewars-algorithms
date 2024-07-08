import java.util.Arrays;
public class AreTheyTheSame {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
      
        if(a.length != b.length)
        System.out.println(false);
        if(a == null || b == null)
        System.out.println(false + " 1");

        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));

    }
}
