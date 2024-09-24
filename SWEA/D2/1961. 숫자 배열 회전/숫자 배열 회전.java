import java.util.Scanner;

class Solution {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int[][] arr = new int[n][n];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          arr[i][j] = sc.nextInt();
        }
      }

      // 90 도
      int[][] arr1 = new int[n][n];
      // 행
      for(int i = 0; i < n; i++){
        // 열
        for(int j = 0; j < n; j++){
          arr1[i][j] = arr[n-1-j][i];
        }
      }

      // 180 도
      int[][] arr2 = new int[n][n];
      // 행
      for(int i = 0; i < n; i++){
        // 열
        for(int j = 0; j < n; j++){
          arr2[i][j] = arr1[n-1-j][i];
        }
      }


      // 270 도
      int[][] arr3 = new int[n][n];
      // 행
      for(int i = 0; i < n; i++){
        // 열
        for(int j = 0; j < n; j++){
          arr3[i][j] = arr2[n-1-j][i];
        }
      }


      System.out.println("#" + t);
      for(int i = 0; i < n; i++){

        for(int j = 0; j < n; j++){
          System.out.print(arr1[i][j]);
        }
        System.out.print(" ");
        for(int j = 0; j < n; j++){
          System.out.print(arr2[i][j]);
        }
        System.out.print(" ");
        for(int j = 0; j < n; j++){
          System.out.print(arr3[i][j]);
        }
        System.out.println();
      }


    }
    sc.close();
  }


}
