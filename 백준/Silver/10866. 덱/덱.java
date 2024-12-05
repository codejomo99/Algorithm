import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {

    static ArrayDeque<Integer> dq = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            Order(str, num);
        }
        System.out.println(sb);
    }

    public static void Order(String str, int num) {

        switch (str) {
            case "push_front": {
                dq.addFirst(num);
                break;
            }
            case "push_back": {
                dq.addLast(num);
                break;
            }
            case "pop_front": {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollFirst()).append("\n");
                }

                break;
            }
            case "pop_back": {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollLast()).append("\n");
                }
                break;
            }
            case "size": {
                sb.append(dq.size()).append("\n");
                break;
            }
            case "empty": {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                break;
            }
            case "front": {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
                break;

            }
            case "back": {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                break;
            }
        }

    }
}
