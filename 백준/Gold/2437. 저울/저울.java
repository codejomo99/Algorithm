import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1, 1, 2, 3, 6, 7, 30
// 1, 2, 4, 7, 13, 20, 50

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i <  n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(sum + 1 < arr[i]) break;
			sum = sum + arr[i];
		}

		System.out.println(sum+1);


	}
}