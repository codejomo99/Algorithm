import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine().trim();

    if (s.isEmpty()) {
      // 입력이 공백만 있는 경우, 단어는 0개
      System.out.println(0);
    } else {
      // 공백을 기준으로 단어를 나누고, 그 길이를 출력
      String[] words = s.split(" ");
      System.out.println(words.length);
    }

    sc.close();
  }
}
