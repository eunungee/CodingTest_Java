import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean check = true;
        for (int i = phone_book.length - 1; i > 0; i--) {
            if (phone_book[i].startsWith(phone_book[i - 1])) {
                check = false;
            }
        }
        return check;
    }
}