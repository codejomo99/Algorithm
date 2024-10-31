import java.util.Arrays;
import java.util.Scanner;


class Room {
    int start;
    int end;

    public Room(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] r = new Room[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            r[i] = new Room(start, end);
        }

        Arrays.sort(r, (r1, r2) -> {
            if (r1.end == r2.end) {
                return r1.start - r2.start;
            }

            return r1.end - r2.end;
        });
        
        int end = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (r[i].start >= end) {
                end = r[i].end;
                res++;
            }
        }

        System.out.println(res);

    }
}
