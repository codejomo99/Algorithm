import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Character,Character> map = new HashMap<>();

    map.put('E','I');
    map.put('I','E');
    map.put('S','N');
    map.put('N','S');
    map.put('T','F');
    map.put('F','T');
    map.put('J','P');
    map.put('P','J');

    String s = sc.next();

    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      System.out.print(map.get(c));
    }




  }

}
