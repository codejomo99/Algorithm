import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      long n = sc.nextLong();
      long minSteps = findMin(n);
      System.out.println("#"+t+" "+minSteps);
    }

    sc.close();
  }

  public static long findMin(long n){
    long minSteps = Long.MAX_VALUE;

    for(long i = 1; i * i <= n; i++){
      if(n % i == 0){
        long j = n / i;

        minSteps = Math.min(minSteps,(i-1) + (j-1));
        minSteps = Math.min(minSteps,(j-1) + (i-1));
      }
    }
    return minSteps;
  }


}
