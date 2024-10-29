import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static int[][] board;
    static int[] length;
    static HashSet<String> set;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            board = new int[4][4];
            set = new HashSet<>();

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            length = new int[7];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    dfs(i, j, 0);
                }
            }

            System.out.println("#" + t + " " + set.size());

        }

    }

    public static void dfs(int x, int y, int L) {

        if (L == 7) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 7; i++) {
                sb.append(length[i]);
            }

            set.add(sb.toString());

            return;
        }

        length[L] = board[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 4 && ny >= 0 && ny < 4) {
                dfs(nx, ny, L + 1);
            }
        }

    }


}
