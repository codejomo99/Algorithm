import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] day = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            day[i] = Integer.parseInt(st.nextToken());
        }

        if (jun(money, day) > sung(money, day)) {
            System.out.println("BNP");
        } else if (jun(money, day) < sung(money, day)) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }


    }

    static int jun(int money, int[] day) {
        int junMoney = money;
        int stock = 0;

        for (int i = 0; i < 14; i++) {
            if (day[i] <= junMoney) {
                stock += junMoney / day[i];
                junMoney %= day[i];
            }
        }

        return stock * day[13] + junMoney;
    }


    static int sung(int money, int[] day) {

        int upCount = 0;
        int downCount = 0;
        int stock = 0;
        int sungMoney = money;

        for (int i = 0; i < 13; i++) {

            if (day[i] > day[i + 1]) {
                upCount++;
                downCount = 0;
            } else if (day[i] < day[i + 1]) {
                downCount++;
                upCount = 0;
            }

            if (upCount >= 3) {
                stock += sungMoney / day[i + 1];
                sungMoney %= day[i + 1];
            } else if (downCount >= 3) {
                downCount = 0;
                sungMoney += stock * day[i + 1];
                stock = 0;
            }
        }

        if (stock > 0) {
            return stock * day[13] + sungMoney;
        } else {
            return sungMoney;
        }
    }


}
