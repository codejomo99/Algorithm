class Solution {
    public int solution(String s) {
        char c = s.charAt(0);

        int num = 0;
        if(c == '-'){
            num = -Integer.parseInt(s.substring(1));
        }else if(c == '+'){
            num = Integer.parseInt(s.substring(1));
        }else{
            num = Integer.parseInt(s);
        }

        return num;
    }
}