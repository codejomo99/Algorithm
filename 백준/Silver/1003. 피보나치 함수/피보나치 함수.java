import java.util.Scanner;

class Main {

    static int[][] dp = new int[100001][2]; // dp[n][0]은 n의 0의 개수, dp[n][1]은 n의 1의 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        // 초기화
        dp[0][0] = 1; // fib(0) 호출 시 0의 개수
        dp[0][1] = 0; // fib(0) 호출 시 1의 개수
        dp[1][0] = 0; // fib(1) 호출 시 0의 개수
        dp[1][1] = 1; // fib(1) 호출 시 1의 개수

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            fibo(n);
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }

    public static int[] fibo(int n) {
        if (dp[n][0] != 0 || dp[n][1] != 0) {
            return dp[n]; // 이미 계산된 경우
        }

        // Fibonacci 수를 계산
        dp[n] = new int[]{fibo(n - 1)[0] + fibo(n - 2)[0], fibo(n - 1)[1] + fibo(n - 2)[1]};
        return dp[n];
    }
}
