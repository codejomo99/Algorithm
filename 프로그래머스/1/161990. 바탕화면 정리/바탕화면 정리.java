class Solution {
    public int[] solution(String[] wallpaper) {
   int[] answer = {50, 50, 0, 0};
    for(int i = 0; i < wallpaper.length; i++) {
      for(int j = 0; j < wallpaper[0].length(); j++) {
        if(wallpaper[i].charAt(j) == '#') {
          answer[0] = Math.min(answer[0], i); // 1,
          answer[1] = Math.min(answer[1], j); // 5,3
          answer[2] = Math.max(answer[2], i+1); // 2,3,4,5
          answer[3] = Math.max(answer[3], j+1); // 6,7,8
        }
      }
    }
    return answer;
    }
}