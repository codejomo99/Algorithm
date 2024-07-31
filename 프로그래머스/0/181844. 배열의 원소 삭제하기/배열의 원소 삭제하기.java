import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i : arr){
            list1.add(i);
        }
        
        for(int i : delete_list){
            list2.add(i);
        }
        
        for(int i = list1.size()-1; i >= 0; i--){
            if(list2.contains(list1.get(i))){
                list1.remove(i);
            }
        }
        
        int[] answer = new int[list1.size()];
        
        for(int i = 0; i < list1.size(); i++){
            answer[i] = list1.get(i);
        }
        
        return answer;
    }
}