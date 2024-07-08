public class NextSmallerNumberWithTheSameDigits {
    public static void main(String[] args) {
        System.out.println(nextSmaller(907));
    }

    public static long nextSmaller(long n){
        char[] carr = String.valueOf(n).toCharArray();
        int len = carr.length, i;
        for (i = len - 1; i > 0; i--) {
            if (carr[i] < carr[i - 1]) break;
        }
        if (i == 0) return -1;
        else {
            int x = carr[i - 1], min = i;
            for (int j = i + 1; j < len; j++) {
                if (carr[j] < x && carr[j] > carr[min]) {
                    min = j;
                }
            }           
            char temp = carr[i-1];
            carr[i-1] = carr[min];
            carr[min] = temp;            
            String[] sarr = String.valueOf(carr).split("");            
            java.util.Arrays.sort(sarr, i, len, java.util.Collections.reverseOrder());
            long r = Long.valueOf(String.join("", sarr));
            return String.valueOf(r).length() == len ? r : -1;
        }
  }
}
