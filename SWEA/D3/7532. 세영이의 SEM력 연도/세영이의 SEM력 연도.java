import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();  // 테스트 케이스 수 입력

    for (int tc = 1; tc <= T; tc++) {
      int S = sc.nextInt();  // 태양 주기 입력
      int E = sc.nextInt();  // 지구 주기 입력
      int M = sc.nextInt();  // 달 주기 입력

      int year = 1;  // 처음 연도는 1년부터 시작
      // 조건을 만족하는 첫 번째 연도를 찾을 때까지 반복
      while (true) {
        if ((year % 365 == (S == 365 ? 0 : S)) &&
            (year % 24 == (E == 24 ? 0 : E)) &&
            (year % 29 == (M == 29 ? 0 : M))) {
          System.out.println("#" + tc + " " + year);
          break;
        }
        year++;
      }
    }
    sc.close();  // Scanner 닫기
  }
}
