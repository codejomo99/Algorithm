import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();
      int[] heights = new int[20];

      for(int i = 0; i < 20; i++){
        heights[i] = sc.nextInt();
      }

      int steps = 0;

      for(int i = 1; i < 20; i++){
        int cur = heights[i];
        int j = i -1;

        while(j >= 0 && heights[j] > cur){
          heights[j+1] = heights[j];
          j--;
          steps++;
        }
        heights[j+1] = cur;
      }

      System.out.println(t+" "+steps);



    }
  }
}
