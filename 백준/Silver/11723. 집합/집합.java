import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

class Main {

    static HashSet<Integer> set;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());  // 입력 숫자 처리

        set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();  // 명령어 한 줄 입력 받음
            String[] ch = s.split(" ");

            if (ch.length == 1) {
                check(ch[0], "0", sb);
            } else {
                check(ch[0], ch[1], sb);
            }
        }

        System.out.print(sb);  // 출력 최적화
    }

    public static void check(String s, String n, StringBuilder sb) {
        int num = Integer.parseInt(n);
        switch (s) {
            case "add":
                set.add(num);
                break;
            case "remove":
                set.remove(num);
                break;
            case "check":
                if (set.contains(num)) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
                break;
            case "toggle":
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
                break;
            case "all":
                set.clear();
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }
                break;
            case "empty":
                set.clear();
                break;
        }
    }
}