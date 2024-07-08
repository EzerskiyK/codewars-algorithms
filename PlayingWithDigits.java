public class PlayingWithDigits {
    public static void main(String[] args) {
        int n = 92;
        int p = 1;
        
        double d=0;
        char[] ch = Integer.toString(n).toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            d +=  Math.pow(Character.getNumericValue(ch[i]), p + i) ;
        }
        long k =(long) d / n;
        System.out.println(k); 
    }
}
