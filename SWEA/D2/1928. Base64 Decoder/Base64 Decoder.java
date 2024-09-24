

import java.util.Base64;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스 수
    sc.nextLine();

    for (int t = 1; t <= T; t++) {
      String encoded = sc.nextLine();

      byte[] decode = Base64.getDecoder().decode(encoded);
      String decodeString = new String(decode);

      System.out.println("#"+t+" "+decodeString);

    }

    sc.close();
  }
}
