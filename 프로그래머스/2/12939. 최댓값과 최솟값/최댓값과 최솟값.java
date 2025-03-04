import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(String st : str){
      int num = Integer.parseInt(st);

      if(num >= max){
        max = num;
      }

      if(num <= min){
        min = num;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(min).append(" ").append(max);

    return sb.toString();
    }
}