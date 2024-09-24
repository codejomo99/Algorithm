
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Solution {

  public static void main(String args[]) throws Exception {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      // 학생 수
      int n = sc.nextInt();

      // 학점을 알고 싶어하는 학생의 번호
      int k = sc.nextInt() - 1;


      // 학생들의 총점 점수
      double[] student = new double[n];

      // 학생들의 Rank 를 위한 배열, 내림차순을 위해 Double 형
      Double[] Rank = new Double[n];

      // 학생들의 총점을 계산
      for(int i = 0; i < n; i++){
        int midScore = sc.nextInt();
        int finalScore = sc.nextInt();
        int studyScore = sc.nextInt();

        double total = midScore * 0.35 + finalScore * 0.45 + studyScore * 0.2;
        student[i] = total;
        Rank[i] = total;
      }

      // Rank 순위를 위한 내림차순
      Arrays.sort(Rank, Collections.reverseOrder());


      // k 번째 학생이 Rank 에 몇번째 있는지 확인
      int studentIdx = 0;
      for(int i = 0; i < n; i++){
        if(student[k] == Rank[i]){
          studentIdx = i;
        }
      }

      // 학점
      String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

      int studentGrade = studentIdx / (n / 10);
      System.out.println("#"+t+" "+grade[studentGrade]);

    }

    sc.close();
  }


}
