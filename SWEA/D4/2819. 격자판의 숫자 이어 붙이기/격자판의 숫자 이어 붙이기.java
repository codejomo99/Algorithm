import java.util.HashSet;
import java.util.Scanner;

class Solution {

    static int[][] arr;
    static int[] ans;

    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            arr = new int[4][4];
            set = new HashSet<>();
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            ans = new int[7];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    dfs(0, i, j);
                }
            }

            System.out.println("#" + t + " " + set.size());

        }

    }

    public static void dfs(int L, int x, int y) {

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        if (L == 7) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 7; i++) {
                sb.append(ans[i]);
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 4 && ny >= 0 && ny < 4) {
                ans[L] = arr[nx][ny];
                dfs(L + 1, nx, ny);
            }
        }
    }


}
