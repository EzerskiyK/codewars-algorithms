import java.util.List;
import java.util.ArrayList;
public class TakeANumberAndSumItsDigits {
    public static void main(String[] args) {
        long a = 1;
        long b = 10;
        List<Long> res = new ArrayList<>();
        for(long i = a; i <= b; i++){
            char[] ch = Long.toString(i).toCharArray();

            long sum =0;
            for(int j = 0; j < ch.length; j++){

                sum += Math.pow((double)ch[j] - '0',(double)j + 1 );
            }
            if(sum == i){
                res.add(i);
            }
        }
        for (Long long1 : res) {
            System.out.println(long1);
        }
        
    }
}
