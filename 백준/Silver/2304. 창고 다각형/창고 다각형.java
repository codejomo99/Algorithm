import java.util.Arrays;
import java.util.Scanner;

class Box {
    int width;
    int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        Box[] box = new Box[T];

        for (int t = 0; t < T; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            box[t] = new Box(x, y);
        }

        // 너비에 따라 정렬
        Arrays.sort(box, (x1, x2) -> x1.width - x2.width);

        // pivot을 정해보자
        int pivot = 0;
        for (int i = 0; i < T; i++) {
            if (box[i].height > box[pivot].height) {
                pivot = i;
            }
        }

        int sum = 0;

        int highIndex = 0;
        // 왼쪽 면적 계산
        for (int i = 0; i <= pivot; i++) {
            if (box[i].height > box[highIndex].height) {
                sum += (box[i].width - box[highIndex].width) * box[highIndex].height; // width 사용
                highIndex = i;
            }
        }

        // 오른쪽 면적 계산

        highIndex = T - 1;
        for (int i = T - 1; i >= pivot; i--) {
            if (box[highIndex].height <= box[i].height) {
                sum += (box[highIndex].width - box[i].width) * box[highIndex].height;
                highIndex = i;
            }
        }

        sum += box[pivot].height; // pivot의 높이 더하기

        System.out.println(sum);
    }
}
