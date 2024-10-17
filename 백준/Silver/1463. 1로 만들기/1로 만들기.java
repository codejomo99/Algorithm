import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println(bfs(n));


    }

    public static int bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.offer(n);
        visited[n] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();

                if (cur == 1) {
                    return steps;
                }

                if (cur % 3 == 0 && !visited[cur / 3]) {
                    visited[cur] = true;
                    queue.offer(cur / 3);
                }
                if (cur % 2 == 0 && !visited[cur / 2]) {
                    visited[cur] = true;
                    queue.offer(cur / 2);
                }
                if (cur > 1 && !visited[cur - 1]) {
                    visited[cur] = true;
                    queue.offer(cur - 1);
                }
            }
            steps++;
        }

        return steps;
    }

}
