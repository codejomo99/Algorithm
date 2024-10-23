import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        dp[0] = 0; // 0을 만드는 방법은 0개
        dp[1] = 1; // 1을 만드는 방법은 1²
        if (n >= 2) {
            dp[2] = 2; // 2를 만드는 방법은 1² + 1²
        }

        for (int i = 3; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            // i보다 작은 제곱수를 사용해서 최소 값을 계산
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1; // 최소 제곱수를 사용하는 횟수
        }

        System.out.println(dp[n]);
    }
}