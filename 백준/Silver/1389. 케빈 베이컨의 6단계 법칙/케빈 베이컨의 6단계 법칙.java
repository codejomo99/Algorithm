import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[][] board;
    static int[] distances;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N + 1][N + 1]; // 친구 관계를 나타내는 인접 행렬

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = board[b][a] = 1; // 친구 관계를 양방향으로 표시
        }

        int minKevinBacon = Integer.MAX_VALUE; // 최소 케빈 베이컨 수
        int resultUser = 0; // 최소 케빈 베이컨 수를 가진 사용자

        for (int i = 1; i <= N; i++) {
            int totalDistance = bfs(i); // 각 사용자에 대해 BFS 수행하여 총 거리 계산
            if (totalDistance < minKevinBacon) {
                minKevinBacon = totalDistance;
                resultUser = i;
            }
        }

        System.out.println(resultUser); // 결과 출력
    }

    public static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1]; // 방문 여부 배열
        distances = new int[N + 1]; // 각 사용자까지의 거리

        queue.offer(start);
        visited[start] = true;
        distances[start] = 0; // 시작점의 거리는 0

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next = 1; next <= N; next++) {
                if (board[current][next] == 1 && !visited[next]) { // 친구 관계이면서 방문하지 않은 경우
                    visited[next] = true;
                    distances[next] = distances[current] + 1; // 거리 업데이트
                    queue.offer(next); // 다음 노드 추가
                }
            }
        }

        int totalDistance = 0; // 총 거리 계산
        for (int i = 1; i <= N; i++) {
            totalDistance += distances[i]; // 모든 사용자와의 거리 합산
        }

        return totalDistance; // 총 거리 반환
    }
}
