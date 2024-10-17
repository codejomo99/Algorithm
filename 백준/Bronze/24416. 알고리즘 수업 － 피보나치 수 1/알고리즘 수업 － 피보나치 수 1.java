import java.util.Scanner;


public class Main {

    static int[] dp;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n + 1];

        count = 0;
        System.out.println(fibo(n) + " " + count);

    }

    public static int fibo(int n) {

        if (dp[n] != 0) {
            return dp[n];
        }

        if (n == 1 || n == 2) {
            return dp[n] = 1;
        } else {
            count++;
            return dp[n] = fibo(n - 1) + fibo(n - 2);
        }
    }

}
