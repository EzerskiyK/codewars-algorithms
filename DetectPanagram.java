public class DetectPanagram {
    public static void main(String[] args) {
        String panagram = "The quick brown fox jumps over the lazy dog".toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char letter : alphabet.toCharArray()) {
            if(panagram.indexOf(letter) == -1)
            System.out.println(false);
        }
        System.out.println(true);
    }
}
