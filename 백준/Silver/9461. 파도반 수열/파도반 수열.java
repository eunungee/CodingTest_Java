import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());

        long[] wave = new long[101];
        wave[0] = 0; wave[1] = 1; wave[2] = 1; wave[3] = 1; wave[4] = 2; wave[5] = 2;
        for (int n = 6; n <= 100; n++) {
            wave[n] = wave[n - 1] + wave[n - 5];
        }

        for (int t = 0; t < times; t++) {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(wave[num]);
        }
    }
}