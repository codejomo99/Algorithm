import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 테스트 케이스는 10개
    for (int test_case = 1; test_case <= 10; test_case++) {
      int t = sc.nextInt(); // 테스트 케이스 번호

      // 100x100 배열
      int[][] arr = new int[100][100];

      for(int i = 0; i < 100; i++){
        for(int j = 0; j < 100; j++){
          arr[i][j] = sc.nextInt();
        } 
      }
      
      int maxSum = 0;
      
      // 각 행의 합
      for(int i = 0; i < 100; i++){
        int rowSum = 0;
        for(int j = 0; j < 100; j++){
          rowSum += arr[i][j];
        }
        if(rowSum > maxSum){
          maxSum = rowSum;
        }
      }
      
      // 각 열의 합
      for(int i = 0; i < 100; i++){
        int colSum = 0;
        for(int j = 0; j < 100; j++){
          colSum += arr[j][i];
        }
        if(maxSum < colSum){
          maxSum = colSum;
        }
      }
      
      // 왼쪽에서 오른쪽으로 대각선의 합
      int diagSum1 = 0;
      for(int i = 0; i < 100; i++){
        diagSum1 += arr[i][i];
      }
      if(diagSum1 > maxSum){
        maxSum = diagSum1;
      }
      
      // 오른쪽에서 왼쪽 대각선의 합
      int diagSum2 = 0;
      for(int i = 0; i < 100; i++){
        diagSum2 += arr[i][99-i];
      }
      if(diagSum2 > maxSum){
        maxSum = diagSum2;
      }

      System.out.println("#"+test_case+" "+maxSum);
      
    }

    sc.close();
  }
}
