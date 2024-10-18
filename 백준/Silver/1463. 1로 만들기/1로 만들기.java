import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
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

        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int temp = q.poll();

                if (temp == 1) {
                    return level;
                }

                if (temp % 3 == 0 && !visited[temp / 3]) {
                    visited[temp] = true;
                    q.offer(temp / 3);
                }

                if (temp % 2 == 0 && !visited[temp/2]) {
                    visited[temp] = true;
                    q.offer(temp / 2);
                }
                
                if(temp > 1 && !visited[temp - 1]){
                    visited[temp] = true;
                    q.offer(temp - 1);
                }

                
            }
            level++;
        }

        return -1;
    }
}
