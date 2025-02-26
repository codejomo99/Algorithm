import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }
        
        // list가 비어있다면 -1을 배열에 담아 리턴
        if (list.isEmpty()) {
            return new int[] {-1};
        }

        // List<Integer> -> int[] 변환 (Stream 사용)
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}