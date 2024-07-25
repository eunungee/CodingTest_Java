import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
     ArrayList<Integer> list = new ArrayList<Integer>();
        int a = slicer[0], b = slicer[1], c = slicer[2];
        switch (n) {
            case 1:
                for (int idx = 0; idx <= b; idx++) {
                    list.add(num_list[idx]);
                }
                break;
            case 2:
                for (int idx = a; idx < num_list.length; idx++) {
                    list.add(num_list[idx]);
                }
                break;
            case 3:
                for (int idx = a; idx <= b; idx++) {
                    list.add(num_list[idx]);
                }
                break;
            case 4:
                for (int idx = a; idx <= b; idx += c) {
                    list.add(num_list[idx]);
                }
                break;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;   
    }
}