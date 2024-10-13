import java.util.*;

class Solution {
    public int solution(String s) {
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<String>();
            for (int j = i; j < s.length(); j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals("(") && s.charAt(j) == ')') {
                        stack.pop();
                    } else if (stack.peek().equals("{") && s.charAt(j) == '}') {
                        stack.pop();
                    } else if (stack.peek().equals("[") && s.charAt(j) == ']') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(j) + "");
                    }
                } else {
                    stack.push(s.charAt(j) + "");
                }
            }
            for (int j = 0; j < i; j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals("(") && s.charAt(j) == ')') {
                        stack.pop();
                    } else if (stack.peek().equals("{") && s.charAt(j) == '}') {
                        stack.pop();
                    } else if (stack.peek().equals("[") && s.charAt(j) == ']') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(j) + "");
                    }
                } else {
                    stack.push(s.charAt(j) + "");
                }
            }
            if(stack.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
}