import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int receiptTotal = Integer.parseInt(sc.nextLine());
        int goodsNum = Integer.parseInt(sc.nextLine());
        int totalPrice = 0;

        for (int idx = 0; idx < goodsNum; idx++) {
            String goodsInfo = sc.nextLine();
            String[] goods = goodsInfo.split(" ");
            int price = Integer.parseInt(goods[0]), quantity = Integer.parseInt(goods[1]);
            totalPrice += (price * quantity);
        }
        if (totalPrice == receiptTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}