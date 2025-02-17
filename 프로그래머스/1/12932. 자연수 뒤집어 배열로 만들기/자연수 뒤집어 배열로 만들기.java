import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String num = String.valueOf(n);
        
        int[] answer = new int[num.length()];
        String reverse = new StringBuilder(num).reverse().toString();
        
        for(int i = 0; i < num.length(); i++){
            answer[i] = reverse.charAt(i) - '0';
        }
        
        return answer;
    }
}