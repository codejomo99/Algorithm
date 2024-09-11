import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();

    for (int t = 1; t <= test; t++) {
      int n = sc.nextInt();
      int sum = 0;

      ArrayList<Integer> a = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        int tmp = sc.nextInt();
        a.add(tmp);
      }

      Collections.sort(a);


      for (int i = 0; i < a.size(); i++) {
        sum += a.get(i);
      }

      sum += a.get(a.size() - 1);
      sum += n;
      System.out.println("#" + t + " " + sum);
    }
  }
}
