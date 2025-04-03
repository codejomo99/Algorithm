import java.io.*;
import java.util.StringTokenizer;

/*

1. 입력값을 저장
2. 비의 양을 0부터 최대 높이까지 바꿔가면서 시뮬
3. 침수된 지역을 제외하고 Dfs로 안전 영역 개수 게산
4. 모든 경우 가장 큰 안전 영역 개수 출력

 */

class Main {

	static int N;
	static int[][] height;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동
	static int[] dy = {-1, 1, 0, 0};


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		height = new int[N][N];

		int maxHeight = 0; // 가장 높은 지역 찾기

		// 입력
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++){
				height[i][j] = Integer.parseInt(st.nextToken());
				maxHeight = Math.max(maxHeight,height[i][j]);
			}
		}


		int safeZone = 1;
		for(int h = 0; h <= maxHeight; h++){
			visited = new boolean[N][N];

			int safeZoneCount = 0;

			for(int i = 0; i < N; i++){
				for(int j = 0; j <N; j++){
					if(height[i][j] > h && !visited[i][j]){
						dfs(i,j,h);
						safeZoneCount++;
					}
				}
				safeZone = Math.max(safeZone,safeZoneCount);
			}

		}

		System.out.println(safeZone);

	}

	// 안전한 영역 찾기
	static void dfs(int x, int y, int h) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (height[nx][ny] > h && !visited[nx][ny]) {
					dfs(nx, ny, h);
				}
			}
		}
	}
}