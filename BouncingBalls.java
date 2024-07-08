public class BouncingBalls {
    public static void main(String[] args) {
        double h = 30;
        double bounce = 0.66;
        double window = 1.5;
        int counter = 1;
        while (true){
            
            h *= bounce;
            if(h <= window){ 
                break;}
            counter = counter + 2;
        }
        System.out.println(counter);
    }
}
