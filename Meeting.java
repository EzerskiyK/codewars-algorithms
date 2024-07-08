import java.util.Arrays;
public class Meeting {
    public static void main(String[] args) {
        String s = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        String[] res = s.split(";");
        for(int i = 0; i < res.length; i++){
            res[i] = "(" + res[i].substring(res[i].indexOf(":") + 1).toUpperCase() + ", " + res[i].substring(0,res[i].indexOf(":")).toUpperCase()+")";
        }
        Arrays.sort(res);
        System.out.println(String.join("", res));
        
    }
}
