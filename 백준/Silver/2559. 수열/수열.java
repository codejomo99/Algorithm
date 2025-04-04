import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());

		arr[0] = Integer.parseInt(st.nextToken());

		for(int i = 1; i < N; i++){
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		

		int max = arr[K-1];
		for(int i = K; i < N; i++) {
			max = Math.max(max, arr[i] - arr[i-K]);
		}

		System.out.println(max);




	}
}