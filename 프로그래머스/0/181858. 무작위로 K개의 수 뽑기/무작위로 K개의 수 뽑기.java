import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> uniqueList = Arrays.stream(arr)
                                          .distinct()
                                          .boxed() 
                                          .collect(Collectors.toList());
        
        
        int[] answer = new int[k];
        
        
        int uniqueSize = uniqueList.size();
        
        
        for (int i = 0; i < k; i++) {
            if (i < uniqueSize) {
                answer[i] = uniqueList.get(i);
            } else {
                answer[i] = -1; 
            }
        }
        
        return answer;
    }
}
