
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스 수

    for(int t = 1; t <= T; t++){
      int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

      int firstMonth = sc.nextInt();
      int firstDay = sc.nextInt();
      int secondMonth = sc.nextInt();
      int secondDay = sc.nextInt();

      // 첫번째 날 계산
      int sumFirstDay = 0;

      for(int i = 1; i < firstMonth; i++){
        sumFirstDay += days[i];
      }
      sumFirstDay += firstDay;

      // 두번째 날 계산
      int sumSecDay = 0;
      for(int i = 1; i < secondMonth; i++){
        sumSecDay += days[i];
      }
      sumSecDay += secondDay;

      System.out.printf("#%d %d\n",t,sumSecDay-sumFirstDay+1);


    }
  }
}
