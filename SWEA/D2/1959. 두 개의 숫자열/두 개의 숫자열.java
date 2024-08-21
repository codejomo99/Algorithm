import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();
      int m = sc.nextInt();


      int[] a = new int[n];
      int[] b = new int[m];


      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }

      for(int i = 0; i < m; i++){
        b[i] = sc.nextInt();
      }

      int maxSum = Integer.MIN_VALUE;

      // n이 작은 경우 (a를 b에 맟춘다)
      if(n <= m){
        for(int i = 0; i <= m-n; i++){
          int sum = 0;
          for(int j = 0; j < n; j++){
            sum += a[j] * b[i+j];
          }
          maxSum = Math.max(maxSum,sum);
        }
      }else{
        for(int i = 0; i <= n-m; i++){
          int sum = 0;
          for(int j = 0; j < m; j++){
            sum += b[j] * a[i+j];
          }
          maxSum = Math.max(maxSum,sum);
        }
      }
      System.out.println("#" + t + " " + maxSum);
    }
  }
}
