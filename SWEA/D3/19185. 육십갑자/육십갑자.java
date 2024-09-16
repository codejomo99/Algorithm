import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      String[] s = new String[n]; // 0부터 시작하는 배열
      String[] k = new String[m]; // 0부터 시작하는 배열

      for (int i = 0; i < n; i++) { // 0부터 n-1까지 채움
        s[i] = sc.next();
      }

      for (int i = 0; i < m; i++) { // 0부터 m-1까지 채움
        k[i] = sc.next();
      }

      int q = sc.nextInt();

      System.out.print("#" + t + " ");
      for (int i = 0; i < q; i++) {
        int year = sc.nextInt();

        // year에서 n, m에 맞는 인덱스 계산 (0부터 시작하는 인덱스)
        int sd = (year - 1) % n; 
        int kd = (year - 1) % m;

        String result = s[sd] + k[kd]; // 해당하는 이름 생성
        System.out.print(result + " ");
      }
      System.out.println(); // 각 테스트 케이스 끝에 줄 바꿈
    }

    sc.close();
  }
}
