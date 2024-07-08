public class ProductOfConsecutiveFibNumbers {
    public static void main(String[] args) {
        long prod = 1;
        long[] res = new long[3];
        long j = 0;
        long q = 1;
        for(long i = 1; j * q < prod; i++){
            if(i % 2 != 0){
                j = j + q;
            }
            if(i % 2 ==0)
            {q = q + j;}

        }
        res[0] = Math.min(j, q);
        res[1] = Math.max(j, q);
        res[2] = j * q == prod ? 1 : 0;
        for (long l : res) {
            System.out.println(l);
        }
        
    }
}
