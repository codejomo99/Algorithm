import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= TC; t++) {
      int N = sc.nextInt(); // 순열의 길이
      int[] p = new int[N];

      for (int i = 0; i < N; i++) {
        p[i] = sc.nextInt(); // 순열의 각 요소 입력
      }

      int ordinaryCount = 0; // 평범한 숫자 개수 카운트

      // 평범한 숫자 개수 세기
      for (int i = 1; i < N - 1; i++) { // i는 2부터 N-1까지
        if ((p[i] > p[i - 1] && p[i] < p[i + 1]) || (p[i] < p[i - 1] && p[i] > p[i + 1])) {
          ordinaryCount++;
        }
      }

      // 결과 출력
      System.out.println("#" + t + " " + ordinaryCount);
    }

    sc.close();
  }
}
