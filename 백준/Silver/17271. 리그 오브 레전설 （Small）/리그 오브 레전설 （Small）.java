import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[] dp = new int[N+1];

		dp[0] = 1;

		for(int i = 1; i <= N; i++){
			dp[i] = dp[i-1];

			if(i >= B){
				dp[i] += dp[i-B];
			}
			
			dp[i] %= 1000000007;
		}

		System.out.println(dp[N]);


	}


}