import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 1. 귤 크기별 세기
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int size : tangerine){
            countMap.put(size, countMap.getOrDefault(size,0)+1);
        }
        
        // 2. 갯수 기준을 정렬
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());
        
        // 3. k 를 채울때까지 많은것부터 선택
        int total = 0;
        int types = 0;
        for(int count : counts){
            total += count;
            types++;
            if(total >= k){
                return types;
            }
        }
        
        return types;
    }
}