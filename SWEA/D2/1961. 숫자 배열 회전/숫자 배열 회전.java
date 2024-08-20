import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt(); 
    for (int t = 1; t <= T; t++) {
      int N = scanner.nextInt();  
      int[][] matrix = new int[N][N];

      
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      // 회전된 행렬 계산
      int[][] rotated90 = rotate90(matrix, N);
      int[][] rotated180 = rotate90(rotated90, N);
      int[][] rotated270 = rotate90(rotated180, N);

      // 출력 형식 맞추기
      System.out.println("#" + t);

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.out.print(rotated90[i][j]);
        }
        System.out.print(" ");
        for (int j = 0; j < N; j++) {
          System.out.print(rotated180[i][j]);
        }
        System.out.print(" ");
        for (int j = 0; j < N; j++) {
          System.out.print(rotated270[i][j]);
        }
        System.out.println();
      }
    }

    scanner.close();
  }

  // 90도 회전 함수
  private static int[][] rotate90(int[][] matrix, int N) {
    int[][] result = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        result[j][N - 1 - i] = matrix[i][j];
      }
    }
    return result;
  }
}
