import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

  static int[][] board;
  static boolean[] visit;
  static int answer = 0;
  static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    visit = new boolean[N+1];
    board = new int[N+1][N+1];

    int T = Integer.parseInt(br.readLine());

    for(int t = 0; t < T ; t++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      board[x][y] = board[y][x] = 1;
    }


    dfs(1);

    System.out.println(answer-1);

  }

  public static void dfs(int depth){
    visit[depth] = true;
    answer++;

    for(int i = 1; i <= N; i++){
      if(!visit[i] && board[depth][i] == 1){
        dfs(i);
      }
    }
  }

}