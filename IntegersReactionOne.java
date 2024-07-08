public class IntegersReactionOne {
    public static void main(String[] args) {
        long a = 1040;
        long b = 1260;
        StringBuilder res = new StringBuilder();
        
       res.append("[");
        for(long j = a; j <= b; j++){
            long sum = 0;
            for (long i = 1 ; i <= j; i++){
                if(j % i == 0){
                    sum += Math.pow(i, 2);
                }
            }
    
            if(Math.sqrt(sum) % 1 == 0){
                    res.append("[" + j + ", " + sum + "], ");
            }
        } 
        if(res.toString().equals("[")){
            System.out.println("[]");
        }else {System.out.println(res.delete(res.length() - 2, res.length()).append("]").toString());}
       
    }
}
