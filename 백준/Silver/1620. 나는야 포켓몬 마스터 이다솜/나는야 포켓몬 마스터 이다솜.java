import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        // 이름을 키로 하고 인덱스를 값으로 하는 HashMap
        HashMap<String, Integer> nameToIndex = new HashMap<>();
        // 인덱스를 키로 하고 이름을 값으로 하는 HashMap
        HashMap<Integer, String> indexToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            nameToIndex.put(str, i); // 이름을 키로 하여 인덱스 저장
            indexToName.put(i, str); // 인덱스를 키로 하여 이름 저장
        }

        for (int i = 1; i <= m; i++) {
            String str = br.readLine();
            if (nameToIndex.containsKey(str)) { // 문자열이 이름일 경우
                System.out.println(nameToIndex.get(str));
            } else { // 숫자일 경우
                int index = Integer.parseInt(str);
                System.out.println(indexToName.get(index));
            }
        }

        br.close();
    }
}