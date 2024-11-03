import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    static int n, m, v;
    static int[][] board;
    static boolean[] visit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        board = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            board[a][b] = board[b][a] = 1;
        }

        visit = new boolean[n + 1];
        visit[v] = true;
        dfs(v);
        System.out.println();
        visit = new boolean[n + 1];
        visit[v] = true;
        bfs(v);

    }

    public static void dfs(int L) {

        System.out.print(L + " ");

        for (int i = 1; i <= n; i++) {
            if (board[L][i] == 1 && !visit[i]) {
                visit[i] = true;
                dfs(i);
            }
        }

    }

    public static void bfs(int L) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(L);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int temp = q.poll();

                System.out.print(temp + " ");

                for (int j = 1; j <= n; j++) {
                    if (board[temp][j] == 1 && !visit[j]) {
                        visit[j] = true;
                        q.add(j);
                    }
                }
            }
        }


    }


}
