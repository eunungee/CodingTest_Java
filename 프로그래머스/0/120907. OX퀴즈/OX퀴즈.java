class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            int x = Integer.parseInt(quiz[i].split(" ")[0]);
            String op = quiz[i].split(" ")[1];
            int y = Integer.parseInt(quiz[i].split(" ")[2]);
            int z = Integer.parseInt(quiz[i].split(" ")[4]);

            if (op.equals("+")) {
                if (x + y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (x - y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}