import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        // 1. 그래프 만들기 (인접 리스트)
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] road : roads) {
            graph[road[0]].add(road[1]);
            graph[road[1]].add(road[0]);
        }

        // 2. BFS를 이용해 목적지에서 각 지역까지 최단 거리 계산
        int[] minDist = new int[n + 1]; // 각 지역까지 최단 거리 저장
        Arrays.fill(minDist, -1); // 기본적으로 도달 불가능(-1)로 초기화
        minDist[destination] = 0; // 목적지까지의 거리는 0

        Queue<Integer> queue = new LinkedList<>();
        queue.add(destination);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph[cur]) {
                if (minDist[next] == -1) { // 아직 방문하지 않은 지역
                    minDist[next] = minDist[cur] + 1; // 현재 거리 +1
                    queue.add(next);
                }
            }
        }

        // 3. sources의 지역에 대한 최단 거리 값 반환
        int[] answer = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            answer[i] = minDist[sources[i]];
        }

        return answer;
    }
}