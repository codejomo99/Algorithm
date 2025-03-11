import java.util.*;

public class Main {
    static int N;
    static int[] nextSenior;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nextSenior = new int[N + 1]; // 1-based index 사용

        for (int i = 1; i <= N; i++) {
            nextSenior[i] = sc.nextInt();
        }

        int maxCount = 0;
        int bestSenior = 1;

        for (int i = 1; i <= N; i++) {
            int count = bfs(i); // i번을 시작점으로 BFS 수행
            if (count > maxCount) {
                maxCount = count;
                bestSenior = i;
            } else if (count == maxCount) {
                bestSenior = Math.min(bestSenior, i);
            }
        }

        System.out.println(bestSenior);
    }

    static int bfs(int start) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            count++;

            int next = nextSenior[cur];
            if (!visited[next]) {
                visited[next] = true;
                queue.add(next);
            }
        }

        return count;
    }
}