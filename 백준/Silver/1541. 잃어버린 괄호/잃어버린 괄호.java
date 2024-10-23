import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split("-");
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < split.length; i++) {

            String[] str = split[i].split("\\+");

            int temp = 0;
            for (int j = 0; j < str.length; j++) {
                temp += Integer.parseInt(str[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);


    }
}
