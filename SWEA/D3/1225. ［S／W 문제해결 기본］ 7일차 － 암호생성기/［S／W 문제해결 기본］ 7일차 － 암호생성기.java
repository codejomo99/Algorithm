import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 테스트 케이스는 10개
    for (int test_case = 1; test_case <= 10; test_case++) {
      int t = sc.nextInt(); // 테스트 케이스 번호

      Queue<Integer> q = new LinkedList<>();

      for(int i = 0; i < 8; i++){
        q.offer(sc.nextInt());
      }


      boolean finish = true;

      while(finish) {
        for (int i = 1; i <= 5; i++) {
          int n = q.poll() - i;

          if (n <= 0) {
            q.offer(0);
            finish = false;
            break;
          } else {
            q.offer(n);
          }
        }
      }

      System.out.print("#"+test_case+" ");
      for(int num : q){
        System.out.print(num+" ");
      }
      System.out.println();

    }

    sc.close();
  }
}
