import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();  // 총 테스트 케이스 수
    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();

      int[] busStop = new int[1001];
      int maxLines = 0;

      for(int i = 0; i < n; i++) {
        int bus = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // A와 B 정류장에 정차 추가
        busStop[a]++;
        busStop[b]++;

        if(bus == 1){
          for(int j = a+1; j < b; j++){
            busStop[j]++;
          }
        }else if(bus == 2){
          for(int j = a+1; j < b; j++){
            if((a % 2 == 0 && j % 2 == 0) || (a % 2 != 0 && j % 2 != 0)){
              busStop[j]++;
            }
          }
        }else if(bus == 3){
          for(int j = a+1; j < b; j++){
            if((a % 2 == 0 && j % 4 == 0) || (a % 2 == 1 && j % 3 == 0 && j % 10 != 0)){
              busStop[j]++;
            }
          }
        }

        // 최대 겹치는 노선 수 찾기

        for (int count : busStop) {
          if (count > maxLines) {
            maxLines = count;
          }
        }
      }
      System.out.println("#"+t+" "+maxLines);

    }
    sc.close();
  }
}
