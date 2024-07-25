import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
                
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(list.isEmpty())
            {
                list.add(arr[i]);
            }
            else if(arr[i] == list.get(list.size()-1))
            {
                list.remove(list.size()-1);
            }
            else
            {
                list.add(arr[i]);
            } 
        }
        
        int[] answer = new int[list.size()];
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}