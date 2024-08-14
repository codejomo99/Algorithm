import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스

    for(int t = 1; t<=T; t++){
      int students = sc.nextInt(); // 학생 수 입력
      int studentsK = sc.nextInt() - 1; // K번째 학생

      double[] scores = new double[students];
      double[] ranks = new double[students];
      String[] grades = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

      for(int s = 0; s < students; s++){
        int midScore = sc.nextInt(); // 중간
        int finScore = sc.nextInt(); // 기말
        int assScore = sc.nextInt(); // 과제

        double score = 0.35 * midScore + 0.45 * finScore + 0.2 * assScore;
        scores[s] = score;
        ranks[s] = score;
      }

      // 버블 정렬로 점수를 내림
      for(int i = 0; i < students - 1; i++){
        for(int j = 0; j < students -1 - i; j++){
          if(ranks[j] < ranks[j + 1]){
            double temp = ranks[j];
            ranks[j] = ranks[j + 1];
            ranks[j + 1] = temp;
          }
        }
      }

      // k번째 학생 순위
      int KRank = 0;
      for(int rank = 0; rank < students; rank++){
        if(ranks[rank] == scores[studentsK]){
          KRank = rank;
          break;
        }
      }

      // 학점
      int gradeIdx = KRank / (students / 10);
      String KGrade = grades[gradeIdx];

      System.out.printf("#%d %s\n",t,KGrade);
    }
    sc.close();;
  }
}
