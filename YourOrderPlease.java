public class YourOrderPlease {
    public static void main(String[] args) {
        String txt = "is2 Thi1s T4est a3";
        String[] notSortedArr = txt.split(" ");
        String[] sortedArr = new String[notSortedArr.length ];
        for (String word : notSortedArr) {
            for(int i = 0; i < word.length(); i++){
                if(Character.isDigit(word.charAt(i))){
                    sortedArr[Character.getNumericValue(word.charAt(i))-1] = word;
                    
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (String string : sortedArr) {
            res.append(string + " ");
        }
        System.out.println(res.toString().trim());
    }
}
