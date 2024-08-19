import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = 1000 - Integer.parseInt(sc.nextLine()), cnt = 0;
        cnt += change / 500;
        change %= 500;
        cnt += change / 100;
        change %= 100;
        cnt += change / 50;
        change %= 50;
        cnt += change / 10;
        change %= 10;
        cnt += change / 5;
        change %= 5;
        cnt += change / 1;
        change %= 1;
        System.out.print(cnt);
    }
}