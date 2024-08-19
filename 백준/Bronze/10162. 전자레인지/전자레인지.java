import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = Integer.parseInt(sc.nextLine());
        System.out.println(microwave(time));
    }

    private static String microwave(int time) {
        int cntA = 0, cntB = 0, cntC = 0;
        if (time >= 300) {
            cntA = time / 300;
            time %= 300;
        }
        if (time >= 60) {
            cntB = time / 60;
            time %= 60;
        }
        if (time >= 10) {
            cntC = time / 10;
            time %= 10;
        }
        if (time == 0) {
            return cntA + " " + cntB + " " + cntC;
        } else {
            return -1 + "";
        }
    }
}