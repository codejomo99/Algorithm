import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {

      String s = sc.nextLine();

      if (s.length() == 1 && s.charAt(0) == '#') {
        break;
      }

      int cnt = 0;

      for (char c : s.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
          cnt++;
        }
      }

      System.out.println(cnt);

    }


  }

}
