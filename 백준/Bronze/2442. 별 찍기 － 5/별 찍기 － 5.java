import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        drawStars(num);
    }

    private static void drawStars(int num) {
        for (int i = 1; i <= num; i++) {
            for (int blank = 0; blank < num - i; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < i * 2 - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
