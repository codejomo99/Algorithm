import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] s1 = new String[n];
        HashSet<String> set = new HashSet<>();  // HashSet 사용

        for (int i = 0; i < n; i++) {
            s1[i] = sc.next();
            set.add(s1[i]);  // 첫 번째 배열의 문자열을 HashSet에 추가
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str = sc.next();
            if (set.contains(str)) {  // HashSet을 사용하여 검색
                list.add(str);
            }
        }

        Collections.sort(list);  // 중복 제거 후 정렬

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}