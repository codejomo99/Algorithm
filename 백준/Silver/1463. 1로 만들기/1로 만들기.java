import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(bfs(n));
    }

    public static int bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        q.offer(n);
        visited[n] = true;

        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int temp = q.poll();

                if (temp == 1) {
                    return L;
                }

                if (temp % 3 == 0 && !visited[temp / 3]) {
                    visited[temp % 3] = true;
                    int num = temp / 3;
                    q.offer(num);
                }

                if (temp % 2 == 0 && !visited[temp / 2]) {
                    visited[temp % 2] = true;
                    int num = temp / 2;
                    q.offer(num);
                }

                if (!visited[temp - 1]) {
                    visited[temp - 1] = true;
                    int num = temp - 1;
                    q.offer(num);
                }

            }
            L++;
        }

        return -1;

    }
}
