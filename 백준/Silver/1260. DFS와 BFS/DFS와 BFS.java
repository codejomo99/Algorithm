import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{

  static int N, M, V;
  static int[][] board, newBoard;
  static boolean[] visit;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());


    board = new int[N+1][N+1];

    for(int t = 0; t < M; t++){
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      board[x][y] = board[y][x] = 1;
    }

    newBoard = board.clone();

    visit = new boolean[N+1];
    dfs(V);
    System.out.println();
    visit = new boolean[N+1];
    bfs(V);
  }

  public static void dfs(int L){
    System.out.print(L+" ");
    visit[L] = true;

    for(int i = 1; i <= N; i++){
      if(board[L][i] == 1 && !visit[i]){
        dfs(i);
      }
    }
  }

  public static void bfs(int L){
    Queue<Integer> q = new LinkedList<>();
    q.add(L);
    visit[L] = true;

    while(!q.isEmpty()){
      int len = q.size();
      for(int i = 0; i < len; i++){
        int temp = q.poll();

        System.out.print(temp + " ");

        for(int j = 1; j <= N; j++){
          if(newBoard[temp][j] == 1 && !visit[j]){
            visit[j] = true;
            q.add(j);
          }
        }
      }

    }


  }
}