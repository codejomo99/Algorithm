import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            sc.next();
            int n = sc.nextInt();
            String[] inputs = new String[n];

            for (int i = 0; i < n; i++) {
                inputs[i] = sc.next();
            }

            Arrays.sort(inputs, (o1, o2) -> {
                int idx1 = 0;
                int idx2 = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (o1.equals(nums[i])) {
                        idx1 = i;
                    }
                    if (o2.equals(nums[i])) {
                        idx2 = i;
                    }
                }
                return idx1 - idx2;
            });

            System.out.println("#" + t);
            for (int i = 0; i < n; i++) {
                System.out.print(inputs[i]+" ");
            }

        }

    }
}
