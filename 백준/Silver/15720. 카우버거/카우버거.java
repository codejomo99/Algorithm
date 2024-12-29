import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int total = 0;

        Integer[] bugger = new Integer[B];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            bugger[i] = Integer.parseInt(st.nextToken());
            total += bugger[i];
        }
        Integer[] side = new Integer[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            side[i] = Integer.parseInt(st.nextToken());
            total += side[i];
        }
        Integer[] drink = new Integer[D];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
            total += drink[i];
        }

        Arrays.sort(bugger, Collections.reverseOrder());
        Arrays.sort(drink, Collections.reverseOrder());
        Arrays.sort(side, Collections.reverseOrder());

        int min = Math.min(B, Math.min(C, D));

        int discount = 0;
        for (int i = 0; i < min; i++) {
            discount += (int) ((bugger[i] + side[i] + drink[i]) * 0.9);
        }

        if (min != B) {
            for (int i = min; i < B; i++) {
                discount += bugger[i];
            }
        }
        if (min != C) {
            for (int i = min; i < C; i++) {
                discount += side[i];
            }
        }
        if (min != D) {
            for (int i = min; i < D; i++) {
                discount += drink[i];
            }
        }

        System.out.println(total);
        System.out.println(discount);


    }
}
