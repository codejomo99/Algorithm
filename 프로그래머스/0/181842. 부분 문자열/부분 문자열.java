class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int length1 = str1.length();
        int length2 = str2.length();
        
        for (int i = 0; i <= length2 - length1; i++) {
            if (str2.substring(i, i + length1).equals(str1)) {
                return 1; // 부분 문자열을 찾으면 1을 반환
            }
        }
        
        return answer; // 찾지 못하면 0을 반환
    }
}
