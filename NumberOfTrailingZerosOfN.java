public class NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        int n = 1000;
        double zr = 0;
        int j = 0;
        int rez = 0;
        for(; n > zr; j++){
            zr = Math.pow(5, j);
            System.out.println(j);
        } 
        for (int i = 1; i < j; i++){
            System.out.println("n/"+5*i);
            rez += (n/Math.pow(5, i));

        }
        System.out.println(rez);
    }
}
