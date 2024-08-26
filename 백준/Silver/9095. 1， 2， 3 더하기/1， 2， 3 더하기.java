import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());

        int[] cnt = new int[11];
        cnt[1] = 1; cnt[2] = 2; cnt[3] = 4;

        for (int i = 4; i < cnt.length; i++) {
            cnt[i] = cnt[i - 1] + cnt[i - 2] + cnt[i - 3];
        }

        for (int t = 0; t < times; t++) {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(cnt[num]);
        }
    }
}