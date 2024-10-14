import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[][] board = new int[1001][1001];

    for(int i = 1; i <= n; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();

      for(int x = a; x < a+c; x++){
        for(int y = b; y < b+d; y++){
          board[x][y] = i;
        }
      }
    }

    for(int k = 1; k <= n; k++){
      int count = 0;
      for(int i = 0; i < 1001; i++){
        for(int j = 0; j < 1001; j++){
          if(board[i][j] == k){
            count++;
          }
        }
      }

      System.out.println(count);
    }



  }
}
