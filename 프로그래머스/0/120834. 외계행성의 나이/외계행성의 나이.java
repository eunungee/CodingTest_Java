class Solution {
    public String solution(int age) {
        String[] alienNum = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder alienAge = new StringBuilder();
        String numAge = age + "";

        for (int i = 0; i < numAge.length(); i++) {
            alienAge.append(alienNum[numAge.charAt(i) - '0']);
        }

        return alienAge.toString();
    }
}