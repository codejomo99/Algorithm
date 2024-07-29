import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 0;
        int a, b, c;
        
        // 학생의 등수와 인덱스를 저장할 리스트
        List<int[]> rankList = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            rankList.add(new int[]{rank[i], i});
        }
        
        // 등수를 기준으로 오름차순 정렬
        rankList.sort((r1, r2) -> Integer.compare(r1[0], r2[0]));
        
        int[] result = new int[3];
        int n = 0;
        
        for (int[] r : rankList) {
            int index = r[1];
            if (attendance[index]) {
                result[n++] = index;
                count++;
                if (count == 3) break; // 3명을 다 선발하면 종료
            }
        }
        
        // a, b, c 학생 번호를 result에서 가져오기
        a = result[0];
        b = result[1];
        c = result[2];
        
        answer = a * 10000 + b * 100 + c;
        
        return answer;
    }
}
