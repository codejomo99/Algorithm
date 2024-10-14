import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int f = sc.nextInt();

    int[][] snail = new int[n][m];


    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};

    int x = 0, y = 0;
    int dir = 0;

    for(int i = 1; i <= n*m; i++){
      snail[x][y] = i;

      int nx = x + dx[dir];
      int ny = y + dy[dir];

      if(nx < 0 || nx >= n || ny < 0 || ny >= m || snail[nx][ny] != 0){
        dir = (dir + 1) % 4;
        nx = x + dx[dir];
        ny = y + dy[dir];
      }

      x = nx;
      y = ny;
    }

    int resultx = 0;
    int resulty = 0;

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        if(snail[i][j] == f){
          resultx = i;
          resulty = j;
        }
      }
    }

    if(n*m < f){
      System.out.println(0);
    }else{
      System.out.println((resultx+1)+" "+(resulty+1));
    }



  }
}
