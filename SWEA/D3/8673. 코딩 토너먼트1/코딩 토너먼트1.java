import java.util.Scanner;

class Solution {

  static int total;

  public static void main(String args[]) throws Exception {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    sc.nextLine();

    // 테스트 케이스
    for (int t = 1; t <= T; t++) {
      int k = sc.nextInt();
      int n = (int) Math.pow(2, k);
      int[] arr = new int[n];

      // 참가자의 수 입력 받음
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      total = 0;
      tournament(arr, 0, n - 1);

      System.out.println("#" + t + " " + total);

    }
  }

  static int tournament(int[] arr, int l, int r) {

    // 경기가 끝났을 때, 한 명만 남는다면 그 사람의 실력을 반환
    if (l == r) {
      return arr[l];
    }

    // 중간 값을 구해 양쪽으로 나누고 토너먼트 진행
    int mid = (l + r) / 2;
    int winnerL = tournament(arr, l, mid); // 왼쪽 토너먼트 승자
    int winnerR = tournament(arr, mid + 1, r); // 오른쪽 토너먼트 승자

    // 지루한 정도 더하기
    total += Math.abs(winnerL - winnerR);  // +=로 누적해야 함

    // 더 강한 사람이 승자가 되므로 둘 중 더 큰 값을 반환
    return Math.max(winnerL, winnerR);
  }

}
