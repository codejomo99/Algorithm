import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();

      Map<Integer,Integer> map = new HashMap<>();
      
      for(int i = 0; i < 1000; i++){
        int num = sc.nextInt();
        map.put(num,map.getOrDefault(num,0)+1);
      }
      
      int max = Integer.MIN_VALUE;
      for(int num : map.values()){
        max = Math.max(max,num);
      }
      
      int result = 0;
      for(int key : map.keySet()){
        if(map.get(key) == max){
          result = Math.max(result,key);
        }
      }

      System.out.println("#"+t+" "+result);
      
    }

    sc.close();
  }
}
