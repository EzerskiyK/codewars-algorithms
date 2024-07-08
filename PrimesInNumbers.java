public class PrimesInNumbers {
    public static void main(String[] args) {
        int n = 86240;
        int counter;
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= n; i++){
            counter = 0;
            int q = 0;
            while(n % i == 0){
                q = i;
                n = n/i;
                counter ++;
            }
            sb.append(q == 0 ? "" : counter > 1 ? "(" + q + " ** " + counter + ")" : "(" + q + ")");
        }
       System.out.println(sb.toString());
       
        
    }
}
