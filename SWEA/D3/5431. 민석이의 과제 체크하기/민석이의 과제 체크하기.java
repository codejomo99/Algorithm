import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      // 제출한 학생
      int[] pass = new int[n];

      for(int i = 0; i < k; i++){
        int x = sc.nextInt();
        pass[x-1]++;
      }

      List<Integer> list = new ArrayList<>();

      for(int i = 0; i < pass.length; i++){
        if(pass[i] == 0){
          list.add(i+1);
        }
      }

      Collections.sort(list);

      System.out.print("#"+t+" ");
      for(int i : list){
        System.out.print(i+" ");
      }
      System.out.println();


    }
  }



}

