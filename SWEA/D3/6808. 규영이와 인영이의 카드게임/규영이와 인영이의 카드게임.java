import java.util.*;

public class Solution {
  static int[] gyuCards = new int[9]; // 규영이의 카드
  static int[] inCards = new int[9]; // 인영이의 카드
  static int[] visited = new int[9]; // 인영이 카드 방문 여부 체크
  static int[] inCardSet = new int[9]; // 인영이 카드 순열 배열
  static int winCount, loseCount; // 이기는 경우, 지는 경우 카운트

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      // 입력 초기화
      boolean[] isUsed = new boolean[19]; // 1~18까지 사용 여부
      for (int i = 0; i < 9; i++) {
        gyuCards[i] = sc.nextInt();
        isUsed[gyuCards[i]] = true; // 규영이가 사용한 카드는 표시
      }

      // 인영이가 사용할 카드 리스트 작성
      int idx = 0;
      for (int i = 1; i <= 18; i++) {
        if (!isUsed[i]) {
          inCards[idx++] = i;
        }
      }

      // 초기화
      winCount = 0;
      loseCount = 0;
      visited = new int[9];

      // DFS 탐색 시작
      dfs(0);

      // 결과 출력
      System.out.printf("#%d %d %d\n", t, winCount, loseCount);
    }

    sc.close();
  }

  // DFS로 인영이의 카드를 선택하는 모든 순서를 확인
  public static void dfs(int L) {
    if (L == 9) {
      // 9장의 카드를 모두 선택한 경우, 승패 계산
      calculateResult();
      return;
    }

    for (int i = 0; i < 9; i++) {
      if (visited[i] == 0) {
        visited[i] = 1;
        inCardSet[L] = inCards[i];
        dfs(L + 1);
        visited[i] = 0;
      }
    }
  }

  // 규영이와 인영이의 카드로 승패 계산
  public static void calculateResult() {
    int gyuScore = 0;
    int inScore = 0;

    for (int i = 0; i < 9; i++) {
      if (gyuCards[i] > inCardSet[i]) {
        gyuScore += gyuCards[i] + inCardSet[i];
      } else {
        inScore += gyuCards[i] + inCardSet[i];
      }
    }

    if (gyuScore > inScore) {
      winCount++;
    } else if (gyuScore < inScore) {
      loseCount++;
    }
  }
}

