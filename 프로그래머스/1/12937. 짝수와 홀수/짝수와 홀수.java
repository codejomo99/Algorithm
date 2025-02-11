class Solution {
    public String solution(int num) {
        String answer = "";
        
        num % 2 == 0 ? answer = "Even" : answer = "Odd";
        return answer;
    }
}