import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++) {

      int[] arr = new int[4];

      for(int i = 0; i < 4; i++){
        arr[i] = sc.nextInt();
      }

      int hour = arr[0] + arr[2];
      int min = arr[1] + arr[3];

      if(min >= 60){
        min -= 60;
        hour++;
      }

      if(hour >= 12){
        hour -= 12;
      }

      System.out.printf("#%d %d %d\n",t,hour,min);



    }
    sc.close();
  }
}
