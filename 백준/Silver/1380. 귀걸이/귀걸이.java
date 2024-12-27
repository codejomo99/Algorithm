import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0; 
        while (true) {
            int T = Integer.parseInt(br.readLine()); 
            if (T == 0) { 
                break;
            }

            cnt++;
            String[] str = new String[T]; 

            for (int i = 0; i < T; i++) {
                str[i] = br.readLine();
            }

            int[] check = new int[T]; 
            for (int i = 0; i < T * 2 - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken()) - 1; 
                check[N]++; 
            }

            int resultIdx = 0;
            for (int j = 0; j < check.length; j++) {
                if (check[j] != 2) { 
                    resultIdx = j;
                    break;
                }
            }

            System.out.printf("%d %s\n", cnt, str[resultIdx]);
        }
    }
}
