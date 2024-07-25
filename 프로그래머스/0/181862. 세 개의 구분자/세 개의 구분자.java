import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        // 'a', 'b', 'c'를 구분자로 사용하여 문자열을 나눕니다.
        String[] parts = myStr.split("[abc]");
        
        // 빈 문자열이 아닌 것만 결과 배열에 포함합니다.
        ArrayList<String> nonEmptyParts = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                nonEmptyParts.add(part);
            }
        }
        
        // 결과 배열이 비어 있으면 ["EMPTY"]를 반환
        if (nonEmptyParts.isEmpty()) {
            return new String[] {"EMPTY"};
        } else {
            return nonEmptyParts.toArray(new String[0]);
        }
    }
}
