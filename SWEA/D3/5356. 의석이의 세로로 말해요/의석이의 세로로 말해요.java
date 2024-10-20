import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            char[][] ch = new char[16][16];

            for (int i = 0; i < 16; i++) {
                Arrays.fill(ch[i], ' '); // 빈칸은 공백으로 초기화
            }

            for (int i = 0; i < 5; i++) {
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    ch[i][j] = s.charAt(j);

                }
            }

            System.out.print("#" + t + " ");
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    if (ch[j][i] != ' ') {
                        System.out.print(ch[j][i]);
                    }
                }
            }
            System.out.println();


        }

    }


}
