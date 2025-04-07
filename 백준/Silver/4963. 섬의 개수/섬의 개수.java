import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){

			StringTokenizer st = new StringTokenizer(br.readLine());

			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());

			if(W == 0 && H == 0){
				return;
			}

			int[][] arr = new int[H][W];

			for(int i = 0; i < H; i++){
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < W; j++){
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(arr[i][j] == 1){
						dfs(arr, i, j, W, H);
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

	public static void dfs(int[][] arr, int x, int y, int W, int H){
		int[] dx = {-1,-1,-1,0,1,1,1,0};
		int[] dy = {-1,0,1,1,1,0,-1,-1};

		arr[x][y] = 0;

		for(int i = 0; i < 8; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];


			if(nx >= 0 && nx < H && ny >= 0 && ny < W && arr[nx][ny] == 1){
				arr[nx][ny] = 0;
				dfs(arr,nx,ny,W,H);
			}
		}
	}
}