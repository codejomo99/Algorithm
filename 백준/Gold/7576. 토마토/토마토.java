import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[][] board;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Queue<int[]> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		board = new int[N][M];

		// 입력
		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++){
				board[i][j] = Integer.parseInt(st.nextToken());

				if(board[i][j] == 1) {
					queue.add(new int[]{i,j});
				}
			}
		}

		bfs();

		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				result = Math.max(result, board[i][j]);
			}
		}
		System.out.println(result - 1);
	}

	public static void bfs() {
		while(!queue.isEmpty()){
			int[] now = queue.poll();
			int x = now[1];
			int y = now[0];

			for(int i = 0; i < 4; i++){
				int nx = x+dx[i];
				int ny = y+dy[i];

				if (nx >= 0 && ny >= 0 && nx < M && ny < N && board[ny][nx] == 0) {
					board[ny][nx] = board[y][x] + 1;
					queue.offer(new int[]{ny, nx});
				}
			}

		}
	}


}