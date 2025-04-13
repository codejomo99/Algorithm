import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	static int N, M;
	static int[] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		visit = new boolean[N];

		dfs(0,0);

	}

	public static void dfs(int L, int S){
		if(L == M){
			for(int i : arr){
				System.out.print(i+" ");
			}
			System.out.println();
		}else{
			for(int i = 0; i < N; i++){
				if(!visit[i]){
					visit[i] = true;
					arr[L] = i+1;
					dfs(L+1, S);
					visit[i] = false;
				}
			}
		}
	}

}