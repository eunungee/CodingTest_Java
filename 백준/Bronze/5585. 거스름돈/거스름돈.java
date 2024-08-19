import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = 1000 - Integer.parseInt(sc.nextLine());
        change = countChange(change, 500);
        change = countChange(change, 100);
        change = countChange(change, 50);
        change = countChange(change, 10);
        change = countChange(change, 5);
        cnt += change;
        System.out.print(cnt);
    }

    private static int countChange(int change, int money) {
        cnt += change / money;
        return change % money;
    }
}