import java.util.Arrays;
public class HelpTheBookseller {
    public static void main(String[] args) {
        String art[] = new String[] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A","B"};
        int[] coun = new int[cd.length];
        StringBuilder rez = new StringBuilder();
        
        for (int j = 0; j < cd.length; j++) {
            int counter = 0;

            for (int i = 0; i < art.length; i++){
                 if (cd[j].charAt(0) == art[i].charAt(0)){
                    counter += Integer.parseInt(art[i].substring(art[i].indexOf(" ") + 1));
                }
            }
            coun[j] = counter;
        }
        if(Arrays.stream(coun).sum() == 0){
        }else{
            for(int i = 0; i < coun.length; i++){
                rez.append("(" + cd[i] + " : " + coun[i] + ") - ");
            }
        }
        System.out.println(rez.toString());
     
    }
}
