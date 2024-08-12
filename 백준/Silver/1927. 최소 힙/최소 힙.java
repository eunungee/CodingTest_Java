import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int times = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < times; t++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                if (pq.peek() == null) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.offer(num);
            }
        }
    }
}