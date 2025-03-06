import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

  static int N;
  static int[][] board;
  static boolean[] visit;
  static int answer = 0;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    board = new int[N+1][N+1];
    visit = new boolean[N+1];


    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      board[x][y] = board[y][x] = 1;
    }

    dfs(1);

    System.out.println(answer-1);

  }

  public static void dfs(int idx){
    visit[idx] = true;
    answer++;


    for(int i = 1; i <= N; i++){
      if(!visit[i] && board[idx][i] == 1){
        dfs(i);
      }
    }
  }


}