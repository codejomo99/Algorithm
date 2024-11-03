import java.util.Scanner;

class Main {

    static int n, m;
    static int[][] board;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int result;
    static boolean[][] visit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];

        // '0'은 0, 'x'은 2, 'I'은 3 , 'P'은 1
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                char c = s.charAt(j);

                if (c == 'O') {
                    board[i][j] = 0;
                } else if (c == 'X') {
                    board[i][j] = 2;
                } else if (c == 'I') {
                    board[i][j] = 3;
                } else if (c == 'P') {
                    board[i][j] = 1;
                }
            }
        }

        result = 0;
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 3) {
                    visit[i][j] = true;
                    dfs(i, j);
                }
            }
        }

        if (result == 0) {
            System.out.println("TT");
        } else {
            System.out.println(result);
        }

    }


    public static void dfs(int x, int y) {

        if (board[x][y] == 1) {
            result++;

        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != 2 && !visit[nx][ny]) {
                visit[nx][ny] = true;
                dfs(nx, ny);
                visit[nx][ny] = true;
            }
        }

    }
}
