public class WhoLikesIt {
    public static void main(String[] args) {
        String[] names = {"Jacob", "Alex"};
        StringBuilder res = new StringBuilder();
        if(names.length > 3 ){
            res.append(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this" );
        }
        for (int i = 0; i < names.length; i++){
            
            res.append(names[i] == null ? "no one likes this" : names.length == 1? names[i] + " likes this" : i+1 == names.length - 1? names[i] + " and " : i == names.length - 1 ?  names[i] + " like this" : names[i] + ", ");
        }

        System.out.println(res.toString());
    }
}
