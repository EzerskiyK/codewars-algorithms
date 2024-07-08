public class CountingDuplicates {
    public static void main(String[] args) {
        String text = "abcdeaB";
        String textLow = text.toLowerCase();
        int counter = 0;
        for (int i = 0; i < textLow.length()-1; i++){
            for(int j = i+1; j < textLow.length(); j++){
                if(textLow.charAt(i) == textLow.charAt(j) && textLow.charAt(i) != ' '){
                    counter++;
                    textLow = textLow.replaceAll(Character.toString(textLow.charAt(i)), " ");
                }
            }
        }
        System.out.println(counter);
    }
}
