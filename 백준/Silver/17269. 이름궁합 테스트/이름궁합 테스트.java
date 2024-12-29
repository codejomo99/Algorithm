import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] nameA = st.nextToken().toCharArray();
        char[] nameB = st.nextToken().toCharArray();

        StringBuilder sb = new StringBuilder();

        if (A <= B) {
            for (int i = 0; i < A; i++) {
                sb.append(nameA[i]).append(nameB[i]);
            }
            for (int i = A; i < B; i++) {
                sb.append(nameB[i]);
            }
        } else {
            for (int i = 0; i < B; i++) {
                sb.append(nameA[i]).append(nameB[i]);
            }
            for (int i = B; i < A; i++) {
                sb.append(nameA[i]);
            }
        }

        int[] num = changeNum(sb.toString());

        int result = Integer.parseInt(findName(num));
        System.out.println(result + "%");


    }

    public static int[] changeNum(String str) {
        int[] num = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'A': case 'F': case 'H': case 'K': case 'M':
                    num[i] = 3;
                    break;
                case 'B': case 'D': case 'N': case 'P': case 'Q': case 'R': case 'T': case 'X': case 'Y':
                    num[i] = 2;
                    break;
                case 'C': case 'G': case 'I': case 'J': case 'L': case 'O': case 'S': case 'U': case 'V': case 'W': case 'Z':
                    num[i] = 1;
                    break;
                case 'E':
                    num[i] = 4;
                    break;
            }
        }

        return num;
    }

    public static String findName(int[] arr) {
        int size = arr.length;
        int[][] board = new int[size][size];

        for (int i = 0; i < size; i++) {
            board[0][i] = arr[i];
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                int num = board[i - 1][j] + board[i - 1][j + 1];
                board[i][j] = num % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(board[size - 2][0]).append(board[size - 2][1]);

        return sb.toString();
    }
}
