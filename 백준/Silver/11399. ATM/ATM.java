import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] time = sc.nextLine().split(" ");
        int[] timeNum = new int[n];

        for (int i = 0; i < n; i++) {
            timeNum[i] = Integer.parseInt(time[i]);
        }
        Arrays.sort(timeNum);

        int minTime = 0;
        int j = n;
        for (int i = 0; i < n; i++, j--) {
            minTime += timeNum[i] * j;
        }
        System.out.println(minTime);
    }
}