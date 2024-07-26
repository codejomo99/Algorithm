import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int nextPowerOfTwo = 1;

        // 가장 가까운 2의 거듭제곱을 찾음
        while (nextPowerOfTwo < length) {
            nextPowerOfTwo *= 2;
        }

        // 이미 길이가 2의 거듭제곱이라면 그대로 반환
        if (nextPowerOfTwo == length) {
            return arr;
        }

        // 결과 배열 생성 및 원본 배열 복사
        int[] answer = new int[nextPowerOfTwo];
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
