import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();

    for (int t = 1; t <= test; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      Map<Integer,Integer> map = new HashMap<>();


      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
          int sum = i+j;
          map.put(sum,map.getOrDefault(sum,0)+1);
        }
      }


      // 값들 중에 빈도수 높은 최댓값 찾기
      int max = Collections.max(map.values());

      // 최댓값과 같은 키값 list 저장
      List<Integer> list = new ArrayList<>();
      for(Integer i : map.keySet()){
        if(map.get(i) == max){
          list.add(i);
        }
      }

      // 리스트 정렬
      Collections.sort(list);

      //출력
      System.out.print("#"+t+" ");
      for(int i : list){
        System.out.print(i+" ");
      }
      System.out.println();



    }
  }
}
