public class TortoiseRacing {
    public static void main(String[] args) {
        int v1 = 720;
        int v2 = 850;
        int g = 70;
        int[] res = new int[3];
        double secTime = ( 3600 * g) / (v2 - v1);
        res[0] = (int)(secTime / 3600);
        res[1] = (int)((secTime % 3600) / 60);
        res[2] = (int)((secTime % 3600) % 60);

        for (int i : res) {
            System.out.println(i);
        }

    }
}
