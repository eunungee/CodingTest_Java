import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dnaNum = Integer.parseInt(st.nextToken());
        int dnaLeng = Integer.parseInt(st.nextToken());

        List<String> dna = new ArrayList<>();
        for (int i = 0; i < dnaNum; i++) {
            dna.add(br.readLine());
        }

        int hamDis = 0;
        StringBuilder finalDna = new StringBuilder();

        for (int i = 0; i < dnaLeng; i++) {
            //T, G, C, A 순서대로 세는 뉴클레오티드 배열 (사전순 반대로)
            String[] nucliotidStr = {"T", "G", "C", "A"};
            int[] nucliotid = new int[4];

            for (int j = 0; j < dnaNum; j++) {
                if ((dna.get(j)).charAt(i) == 'T') {
                    nucliotid[0]++;
                } else if ((dna.get(j)).charAt(i) == 'G') {
                    nucliotid[1]++;
                } else if ((dna.get(j)).charAt(i) == 'C') {
                    nucliotid[2]++;
                } else {
                    nucliotid[3]++;
                }
            }

            int max = 0, idx = 0;
            for (int j = 0; j < nucliotid.length; j++) {
                if (max <= nucliotid[j]) {
                    max = nucliotid[j];
                    idx = j;
                }
            }
            hamDis += (dnaNum - max);
            finalDna.append(nucliotidStr[idx]);
        }
        System.out.println(finalDna);
        System.out.println(hamDis);
    }
}