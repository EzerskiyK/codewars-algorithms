public class test {
    public static void main(String[] args) {
        String text = "A wise old owl lived in an oak";
        StringBuilder res = new StringBuilder();
        for (String word : text.split(" ")) {
            if(word.length() == 1){
                res.append((int) word.charAt(0) + " ");
                continue;
            }
            if(word.length() == 2){
                res.append((int) word.charAt(0));
                res.append( word.charAt(word.length()-1) + " ");
                continue;
            }
            res.append((int) word.charAt(0));
            res.append(word.charAt(word.length()-1));
            res.append(word.substring(2,word.length()-1));       
            res.append(word.charAt(1));
            res.append(" ");
            System.out.println(res);
        }
        System.out.println(res.toString().substring(0, res.length()-1));
    }
}
