
public class AddingBigNumbers {
    public static void main(String[] args) {
        String num1 = "888";
        String num2 = "222";
        
        System.out.println(Plus.add(num1, num2)); 
        
    }
}

class Plus{
    public static String add(String num1, String num2){
        StringBuilder n1 = new StringBuilder();
        n1.append(num1);
        n1.reverse();
        StringBuilder n2 = new StringBuilder();
        n2.append(num2);
        n2.reverse();

        

        if(n1.length()>n2.length()){
            do{
                n2.append("0");
            }while(n1.length() != n2.length());
        }else if(n1.length()<n2.length()){
            do{
                n1.append("0");
            }while(n1.length() != n2.length());
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0, temp = 0; i < n2.length(); i++){

            int value = Character.getNumericValue(n1.charAt(i)) + Character.getNumericValue(n2.charAt(i)) + temp;
            
            if(value >= 10){
                temp = value/10;
                value %= 10;
            }else{
                temp = 0;
            }
            result.append(value);
            if(i == n2.length()-1 && temp != 0){
                result.append(temp);
            }
        }

        result.reverse();
    
        while(result.indexOf("0") == 0){
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
