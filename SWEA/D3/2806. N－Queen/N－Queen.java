import java.util.Scanner;


public class Solution {
    static int ans = 0;
    static int[] chess;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            ans = 0;
            N = sc.nextInt();

            chess = new int[N];
            dfs(0);

            System.out.println("#" + t + " " + ans);
        }

    }

    public static void dfs(int L) {
        if (L == N) {
            ans++;
            return;
        }

        for (int i = 0; i < N; i++) {
            chess[L] = i;
            if (isPossible(L)) {
                dfs(L + 1);
            }
        }
    }

    public static boolean isPossible(int L) {
        for (int i = 0; i < L; i++) {
            if (chess[i] == chess[L] || L - i == Math.abs(chess[L] - chess[i])) {
                return false;
            }
        }
        return true;
    }
}
