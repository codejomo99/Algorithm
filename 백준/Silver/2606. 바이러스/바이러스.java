
import java.util.Scanner;

public class Main {

  static int n,m;
  static boolean[][] graph;
  static boolean[] visited;
  static int answer;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scanner 사용
    n = sc.nextInt();
    m = sc.nextInt();

    graph = new boolean[n+1][n+1];
    visited = new boolean[n+1];

    int x,y;
    for(int i = 0; i < m; i++){
      x = sc.nextInt();
      y = sc.nextInt();
      graph[x][y] = true;
      graph[y][x] = true;
    }

    dfs(1);

    System.out.println(answer-1);


    sc.close(); // Scanner 닫기
  }

  public static void dfs(int idx){
    visited[idx] = true;
    answer++;

    for(int i = 1; i <= n; i++){
      if(!visited[i] && graph[idx][i]){
        dfs(i);
      }
    }
  }



}
