import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Column[] columns = new Column[n];

    // 기둥 입력
    for (int i = 0; i < n; i++) {
      columns[i] = new Column(sc.nextInt(), sc.nextInt());
    }

    // 람다식을 사용한 정렬 (위치 오름차순)
    Arrays.sort(columns, (c1, c2) -> c1.location - c2.location);

    int area = 0; // 창고 면적을 누적
    int pivot = 0;

    // 가장 높은 기둥을 pivot으로 설정
    for (int i = 0; i < n; i++) {
      if (columns[pivot].high < columns[i].high) {
        pivot = i;
      }
    }

    // 가장 왼쪽 기둥부터 pivot까지 넓이 계산
    int highIndex = 0;
    for (int i = 0; i <= pivot; i++) {
      if (columns[highIndex].high <= columns[i].high) {
        area += (columns[i].location - columns[highIndex].location) * columns[highIndex].high;
        highIndex = i;
      }
    }

    // 가장 오른쪽 기둥부터 pivot까지 넓이 계산
    highIndex = n - 1;
    for (int i = n - 1; i >= pivot; i--) {
      if (columns[highIndex].high <= columns[i].high) {
        area += (columns[highIndex].location - columns[i].location) * columns[highIndex].high;
        highIndex = i;
      }
    }

    // pivot 기둥의 넓이 추가
    area += columns[pivot].high;

    System.out.println(area);
  }

  // 기둥 클래스, x 좌표와 높이로 구성
  public static class Column {
    public int location;
    public int high;

    public Column(int location, int high) {
      this.location = location;
      this.high = high;
    }
  }
}
