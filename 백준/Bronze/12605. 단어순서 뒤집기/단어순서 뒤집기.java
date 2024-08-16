import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < num; n++) {
            String input = sc.nextLine();
            String[] strArray = input.split(" ");
            System.out.print("Case #"+ (n + 1) + ":");
            for (int i = strArray.length - 1; i >= 0 ; i--) {
                System.out.print(" " + strArray[i]);
            }
            System.out.println();
        }
    }
}