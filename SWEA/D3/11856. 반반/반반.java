import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {
      String s = sc.next();
      String answer = "Yes"; 

      Map<Character,Integer> map = new HashMap<>();

      for(char c : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0) + 1);
      }

      // 서로 다른 문자의 개수와 각각의 등장 횟수를 확인
      if (map.size() != 2) {  // 서로 다른 문자가 정확히 2개가 아니면 "No"
        answer = "No";
      } else {
        for (int count : map.values()) {
          if (count != 2) {  // 각 문자가 정확히 2번 등장하지 않으면 "No"
            answer = "No";
            break;
          }
        }
      }

      System.out.println("#" + t + " " + answer);
    }
  }
}
