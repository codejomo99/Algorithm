import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();
        
        for(int n : delete_list){
            deleteSet.add(n);
        }
        
        for(int n : arr){
            if(!deleteSet.contains(n)){
                list.add(n);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}