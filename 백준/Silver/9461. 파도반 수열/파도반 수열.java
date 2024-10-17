import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            long[] dp = new long[101];

            dp[1] = 1L;
            dp[2] = 1L;
            dp[3] = 1L;
            dp[4] = 2L;
            dp[5] = 2L;

            for (int j = 6; j <= x; j++) {
                dp[j] = dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[x]);
        }

    }


}
