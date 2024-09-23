import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    StringBuilder result = new StringBuilder();

    for (int t = 0; t < T; t++) {
      long x = sc.nextLong(); // x의 초기 값
      long y = sc.nextLong(); // y의 초기 값
      long N = sc.nextLong(); // N

      int count = 0; // 연산 횟수


      // x나 y가 N을 초과할 때까지 연산
      while (x <= N && y <= N) {
        if (x < y) {
          x += y; // x에 y를 더하기
        } else {
          y += x; // y에 x를 더하기
        }
        count++; // 연산 횟수 증가
      }

      result.append(count).append("\n"); // 결과 저장
    }

    System.out.print(result); // 결과 출력
    sc.close();
  }
}
