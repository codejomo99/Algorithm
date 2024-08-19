import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[][] arr = new int[n][n];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          arr[i][j] = sc.nextInt();
        }
      }

      int answer = 0;

      // 가로
      for(int i = 0; i < n; i++){
        int cnt = 0;
        for(int j = 0; j < n; j++){
          if(arr[i][j]==1) cnt++;
          else cnt = 0;

          if(cnt == k && (j == n -1 || arr[i][j+1] == 0)){
            answer++;
          }
        }


      }

      // 세로
      for(int i = 0; i < n; i++){
        int cnt = 0;
        for(int j = 0; j < n; j++){
          if(arr[j][i] == 1) cnt++;
          else cnt = 0;
          // 정확히 K 길이의 단어를 확인하고, 그 다음에는 공간이 더 없을 때
          if(cnt == k && (j == n - 1 || arr[j + 1][i] == 0)){
            answer++;
          }
        }

      }
      System.out.printf("#%s %d\n",t,answer);
    }
    sc.close();
  }
}
