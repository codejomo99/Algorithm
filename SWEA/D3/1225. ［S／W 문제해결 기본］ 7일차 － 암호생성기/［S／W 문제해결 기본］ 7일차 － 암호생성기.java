import java.io.FileInputStream;
import java.util.*;

class Solution {

  static int[] arr;

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    for (int t = 1; t <= 10; t++) {
      int n = sc.nextInt();

      Queue<Integer> q = new LinkedList<>();

      // q에 담는다.
      for (int i = 0; i < 8; i++) {
        q.add(sc.nextInt());
      }

      boolean flag = true;
      while (flag) {
        for (int i = 1; i <= 5; i++) {
          int num = q.poll() - i;
          if (num <= 0) {
            q.offer(0);
            flag = false;
            break;
          } else {
            q.offer(num);
          }
        }
      }

      System.out.print("#"+t+" ");
      for (int i : q) {
        System.out.print(i + " ");
      }
      System.out.println();


    }


  }
}



