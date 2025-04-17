import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] cost = new int[N+1][M+2];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // dp[i][j][d]
        int[][][] dp = new int[N+1][M+2][3];
        // 초기화
        for (int i = 0; i <= N; i++)
            for (int j = 0; j <= M+1; j++)
                Arrays.fill(dp[i][j], INF);
        for (int j = 1; j <= M; j++) {
            for (int d = 0; d < 3; d++) {
                dp[1][j][d] = cost[1][j];
            }
        }
        // DP 진행
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                // ↙(0)
                dp[i][j][0] = Math.min(dp[i-1][j+1][1], dp[i-1][j+1][2]) + cost[i][j];
                // ↓(1)
                dp[i][j][1] = Math.min(dp[i-1][j][0],   dp[i-1][j][2])   + cost[i][j];
                // ↘(2)
                dp[i][j][2] = Math.min(dp[i-1][j-1][0], dp[i-1][j-1][1]) + cost[i][j];
            }
        }
        // 결과 계산
        int ans = INF;
        for (int j = 1; j <= M; j++) {
            for (int d = 0; d < 3; d++)
                ans = Math.min(ans, dp[N][j][d]);
        }
        System.out.println(ans);
    }
}