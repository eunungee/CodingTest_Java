import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputNum = input.split(" ");

        int n = Integer.parseInt(inputNum[0]), price = Integer.parseInt(inputNum[1]);
        int[] coin = new int[n];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(sc.nextLine());
        }

        for (int j = coin.length - 1; j >= 0; j--) {
            price = divideCoin(price, coin[j]);
        }
        System.out.println(cnt);
    }

    private static int divideCoin(int price, int coin) {
        cnt += price / coin;
        return price % coin;
    }
}