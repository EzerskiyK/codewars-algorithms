public class HighestScoringWord {
    public static void main(String[] args) {
        String s = "man i need a taxi up to ubud";
        String[] arr = s.split(" ");
        int longest=0;
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for(char ch : arr[i].toCharArray()) {
                temp += (int)ch - 96; 
            }
            if(temp> longest){
                longest = temp;
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
