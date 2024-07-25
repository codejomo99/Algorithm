import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){        
            if(flag[i]){
                for(int k = 0; k < arr[i] * 2; k++){
                    list.add(arr[i]);
                }
            }else {
                
                int size = list.size();
                int removeCount = Math.min(arr[i], size);
                for (int k = 0; k < removeCount; k++) {
                    list.remove(size - 1 - k);
                }
            }    
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}