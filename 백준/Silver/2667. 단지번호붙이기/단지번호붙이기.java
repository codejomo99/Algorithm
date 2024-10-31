import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static int n;
    static int[][] board;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static boolean[][] visit;

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                int num = s.charAt(j) - '0';
                board[i][j] = num;
            }
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    list.add(dfs(i, j));
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }

        sc.close();
    }

    public static int dfs(int x, int y) {

        int cnt = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                cnt += dfs(nx, ny);
            }
        }

        return cnt;
    }


}
