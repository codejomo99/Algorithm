class Solution {
     public static String solution(String new_id) {

    // 1단계: 소문차 변환
    new_id = new_id.toLowerCase();

    // 2단계: '!','@','#','*' 문자 제거
    new_id = new_id.replaceAll("[^a-z0-9._-]","");

    // 3단계: '...', '..' 를 '.' 으로 변환
    StringBuilder sb = new StringBuilder();
    sb.append(new_id.charAt(0));
    for(int i = 1; i < new_id.length(); i++){
      if(new_id.charAt(i) == '.') {
        if(new_id.charAt(i-1) == '.'){
          continue;
        }else{
          sb.append(new_id.charAt(i));
        }
      }else{
        sb.append(new_id.charAt(i));
      }
    }

    // 4단계: 맨앞,맨뒤 '.' 이 있으면 제거
    if(sb.charAt(0) == '.') {
      sb.deleteCharAt(0);
    }else if(sb.charAt(sb.length()-1) == '.'){
      sb.deleteCharAt(sb.length()-1);
    }

    // 5단계: new_id가 빈 문자열이라면, new_id 에 "a"를 대입합니다.
    if(sb.toString().isEmpty()){
      sb.append('a');
    }

    // 6단계: new_id가 16자 이상이면, new_id 의 첫 15개의 문자를 제외하고 제거
    if(sb.length() >= 16) {
      sb.delete(15,sb.length());
    }

    if(sb.charAt(sb.length()-1) == '.'){
      while(sb.charAt(sb.length()-1) == '.'){
        sb.deleteCharAt(sb.length()-1);
      }
    }

    // 7단계: new_id 가 2자 이하라면, 마지막 문자를 길이가 3이 될대 까지 반복해서 붙입니다.
    if(sb.length() <= 2){
      while(sb.length() < 3){
        sb.append(sb.charAt(sb.length()-1));
      }
    }

    return sb.toString();
  }
}