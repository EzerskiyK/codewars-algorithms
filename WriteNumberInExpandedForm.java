public class WriteNumberInExpandedForm {
    public static void main(String[] args) {
        int num = 420370022;
        StringBuilder res = new StringBuilder();
        int div = 1;
        while(num / div >= 10){
            div *= 10;
        }
        while(num > 0){
            int dig = num / div;
            if(dig > 0){
                res.append(dig * div + " + ");
            }  
            num %= div;
            div /=10;
        }
        System.out.println(res.toString().substring(0, res.length() - 3));
    }
}
