import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static void main(String[] args) {
        Counter.count("dklasdmsakldmvdksfm");
    }
}

class Counter{
    public static Map<Character, Integer> count(String a){
        Map<Character,Integer> res = new HashMap<>();
       if(a.isEmpty()){
        return res;
       }
        do{
            char charPutIntoMap = a.charAt(0);
            int count = a.length();
            a = a.replaceAll(String.valueOf(a.charAt(0)), "");
            res.put(charPutIntoMap, count - a.length());

        }while(a.length() != 0);
        return res;
    }
}
