import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];

        dp[1] = arr[0];
        
        if(n >= 2){
            dp[2] = arr[0] + arr[1];
        }
        
        

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i - 1], dp[i - 3] + arr[i - 2] + arr[i - 1]);
        }

        System.out.println(dp[n]);

    }


}
