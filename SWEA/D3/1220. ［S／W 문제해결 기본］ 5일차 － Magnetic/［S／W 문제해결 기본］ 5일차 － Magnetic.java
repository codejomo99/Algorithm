import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int t=1; t<=10; t++) {
      sc.nextInt();
      int table[][] = new int[100][100];

      int answer = 0; //테이블 위에 남아있는 교착 상태의 개수

      //1: N극 윗부분으로 이끌림, 2:S극 아래부분에 이끌림
      for(int i=0; i<100; i++)
      {
        for(int j=0; j<100; j++)
        {
          table[i][j] = sc.nextInt();
        }
      }

      //교착 상태 계산
      for(int i=0; i<100; i++)
      {
        boolean flag = false; //현재 열에 N이 있는지 여부
        for(int j=0; j<100; j++)
        {
          if(table[j][i] == 1)
          {
            flag =true; //N극이 발견되었음을 표시

          }
          //현재 위치에 자성체가 있고, 그 자성체가 s극 이며 이전에 N극이 있었던 경우  
          else if(table[j][i]==2&&flag)
          {
            answer++; //N극 다음에 S극이 나오면 교착상태 발생
            flag= false; //교착 상태를 처리했으므로 초기화 
          }
        }
      }



      System.out.printf("#%d %d\n", t, answer);
    }
  }
}