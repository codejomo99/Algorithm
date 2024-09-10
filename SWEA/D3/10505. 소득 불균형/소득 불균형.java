import java.util.Scanner;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();

    for (int t = 1; t <= TC; t++) {
      int n = sc.nextInt();
      int[] m = new int[n];

      for(int i = 0; i < n; i++){
        m[i] = sc.nextInt();
      }

      int answer = 0;
      int sum = 0;
      int avg = 0;

      for(int i = 0; i < m.length; i++){
        avg = (sum += m[i]) / m.length;
      }

      for(int i : m){
        if(avg >= i){
          answer++;
        }
      }

      System.out.println("#"+t+" "+answer);

    }
  }

}
