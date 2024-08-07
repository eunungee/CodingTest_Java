import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.nextLine());
        Stack<Integer> num = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) {
                num.pop();
            } else {
                num.push(n);
            }
        }
        int sum = 0;
        while(!num.isEmpty()) {
            sum += num.pop();
        }
        System.out.println(sum);
    }
}