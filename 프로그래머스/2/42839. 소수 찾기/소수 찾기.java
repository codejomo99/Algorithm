import java.util.*;
class Solution {
    public static int solution(String numbers) {
    boolean[] visited = new boolean[numbers.length()];
    Set<Integer> set = new HashSet<>();

    // DFS로 모든 길이의 순열 생성
    for (int len = 1; len <= numbers.length(); len++) {
      dfs(numbers, "", len,visited,set);
    }

    // 소수 개수 카운트
    int count = 0;
    for (int num : set) {
      if (isPrime(num)) {
        count++;
      }
    }

    return count;
  }

  // DFS로 모든 길이의 순열 생성
  public static void dfs(String numbers, String current, int length, boolean[]visited, Set<Integer> set) {
    // 현재 순열의 길이가 목표 길이와 같으면 Set에 저장
    if (current.length() == length) {
      int num = Integer.parseInt(current);
      set.add(num); // 중복 제거
    }

    // DFS로 다음 숫자 선택
    for (int i = 0; i < numbers.length(); i++) {
      if (!visited[i]) {
        visited[i] = true;
        dfs(numbers, current + numbers.charAt(i), length, visited, set);
        visited[i] = false;
      }
    }
  }

  // 소수 검사 메서드
  public static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}