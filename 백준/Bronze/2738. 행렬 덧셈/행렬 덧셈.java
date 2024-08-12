import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(s.nextToken()), col = Integer.parseInt(s.nextToken());
        int[][] a = new int [row][col], b = new int [row][col];

        for (int i = 0; i < row; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < row; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + b[i][j]);
                if (j != col - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}