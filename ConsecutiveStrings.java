
public class ConsecutiveStrings {
    public static void main(String[] args) {
        String[] starr = {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"};
        int k = 15;
        int longest = 0;
        int indexOflongest = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < starr.length; i++){
            int temp = 0;
            for(int j = i; j < i + k; j++ ){
                if(i + k  > starr.length){
                    break;
                }
                temp += starr[j].length(); 
                
            }
            if (temp > longest){
                longest = temp;
                indexOflongest = i;
            }
        }
        for(int i = indexOflongest; i < indexOflongest + k; i++){
            res.append(starr[i]);
        }        
        System.out.println(res.toString());
    }
}
