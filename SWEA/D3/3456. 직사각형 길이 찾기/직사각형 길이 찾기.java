import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      Map<Integer,Integer> map = new HashMap<>();

      map.put(a,map.getOrDefault(a,0)+1);
      map.put(b,map.getOrDefault(b,0)+1);
      map.put(c,map.getOrDefault(c,0)+1);


      int d = 0;

      for(int i : map.keySet()){
        if(map.get(i) == 1){
          d = i;
        }else if(map.get(i) == 3){
          d = i;
        }
      }


      System.out.printf("#%d %d\n",t,d);
    }
  }



}

