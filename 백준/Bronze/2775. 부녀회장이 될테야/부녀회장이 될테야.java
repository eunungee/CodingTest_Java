import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < testCase; t++) {
            int floor = Integer.parseInt(sc.nextLine());
            int roomNum = Integer.parseInt(sc.nextLine());

            int[][] tenants = new int[floor + 1][roomNum + 1];

            for (int r = 0; r <= roomNum; r++) {
                tenants[0][r] = r;
            }

            for (int f = 1; f <= floor; f++) {
                for (int r = 1; r <= roomNum; r++) {
                    tenants[f][r] = tenants[f][r - 1] + tenants[f - 1][r];
                }
            }
            System.out.println(tenants[floor][roomNum]);
        }
    }
}