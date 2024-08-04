class Solution {
    public String solution(String s) {
        String[] elements = s.split("");
        StringBuilder answer = new StringBuilder();
        int evenOdd = 0;
        for (int idx = 0; idx < elements.length; idx++) {
            if (elements[idx].equals(" ")) {
                answer.append(elements[idx]);
                evenOdd = 0;
            } else if (evenOdd % 2 == 0) {
                answer.append(elements[idx].toUpperCase());
                evenOdd++;
            } else {
                answer.append(elements[idx].toLowerCase());
                evenOdd++;
            }
        }
        return answer.toString();
    }
}