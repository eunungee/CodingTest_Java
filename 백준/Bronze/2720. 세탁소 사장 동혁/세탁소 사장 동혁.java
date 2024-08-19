import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < times; i++) {
            int money = Integer.parseInt(sc.nextLine());
            int[] cntCoins = new int[4];
            for (int j = 0; j < cntCoins.length; j++) {
                cntCoins[j] = money / coins[j];
                money %= coins[j];
            }
            System.out.println(cntCoins[0] + " " + cntCoins[1] + " " + cntCoins[2] + " " + cntCoins[3]);
        }
    }
}