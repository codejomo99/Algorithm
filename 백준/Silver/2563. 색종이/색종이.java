import com.sun.security.jgss.GSSUtil;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[][] board = new int[100][100];

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          board[j][k] = 1;
        }
      }
    }
    int sum = 0;
    for (int k = 0; k < 100; k++) {
      for (int j = 0; j < 100; j++) {
        sum += board[k][j];
      }
    }


    System.out.println(sum);

  }
}
