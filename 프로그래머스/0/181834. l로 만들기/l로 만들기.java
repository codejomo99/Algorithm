class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()){
            if(c >= 97 && c < 108){
                c = 'l';
            }
            answer += c;
        }
        

        return answer;
    }
}