import java.util.Scanner;

public class Main {

    static int N, M;
    static int[][] board;
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[1001][1001];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = board[b][a] = 1;
        }

        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

        sc.close();
    }

    public static void dfs(int i) {
        if (visited[i] == true) {
            return;
        } else {
            visited[i] = true;
            for (int j = 1; j <= N; j++) {
                if (board[i][j] == 1) {
                    dfs(j);
                }
            }
        }
    }
}
