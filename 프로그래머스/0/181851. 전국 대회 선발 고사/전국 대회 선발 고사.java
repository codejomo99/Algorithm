import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        // rank와 index를 저장할 Map
        Map<Integer, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < rank.length; i++) {
            rankMap.put(rank[i], i);
        }
        
        // rank를 키로 하여 정렬된 키 목록을 생성
        List<Integer> sortedRanks = new ArrayList<>(rankMap.keySet());
        Collections.sort(sortedRanks);
        
        int[] result = new int[3];
        int count = 0;
        
        // 등수가 낮은 순서대로 attendance를 확인하고 선발
        for (int r : sortedRanks) {
            int index = rankMap.get(r);
            if (attendance[index]) {
                result[count++] = index;
                if (count == 3) break; // 3명을 다 선발하면 종료
            }
        }
        
        // 결과 계산
        int a = result[0];
        int b = result[1];
        int c = result[2];
        answer = a * 10000 + b * 100 + c;
        
        return answer;
    }
}
