import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int t = 1; t <= 10; t++){
      int n = sc.nextInt();
      int[][] arr = new int[n][n];

      for(int i = 0; i < 100; i++){
        for(int j = 0; j < 100; j++){
          arr[i][j] = sc.nextInt();
        }
      }

      int cnt = 0;

      for(int i = 0; i < 100; i++){
        boolean flag = false;
        for(int j = 0; j < 100; j++){
          if(arr[j][i] == 1){
            flag = true;
          }

          if(flag){
            if(arr[j][i] == 2){
              cnt++;
              flag = false;
            }
          }
        }
      }

      System.out.println("#"+t+" "+cnt);




    }

    sc.close();
  }
}
