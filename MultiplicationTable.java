public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 1;
        int [][] res = new int[size][size];
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                res[i-1][j-1] = i * j;
            }
            
        }
        for (int[] is : res) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }
    }
}
