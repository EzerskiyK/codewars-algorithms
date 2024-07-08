import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
      int[] result = Diff.difference(new int[]{2,2,1,4}, new int[]{1});
      System.out.println(Arrays.toString(result));
       
    }
}

class Diff{
  public static int[] difference(int[] a, int[] b){
       for (int i : b) {
         a = Arrays.stream(a).filter(varA -> varA != i).toArray();
       }
       return a;
  }
}