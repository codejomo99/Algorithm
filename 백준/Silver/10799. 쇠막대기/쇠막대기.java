import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s = bf.readLine(); //String
        Stack<Character> stack=new Stack<Character>();

        int result=0; //잘려진 조각의 총 개수

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){   //일단 stack에 넣자
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                if(s.charAt(i-1)=='('){ // 이경우 레이저 이다
                    stack.pop(); //그러므로 아까 넣은 '('를 빼주고
                    result+=stack.size(); //이 레이저로 자를수 있는 part는 현재 스택에 있는 쇠막대기 개수이다
                }
                else if(s.charAt(i-1)!='('){ //이 경우 쇠막대기이다
                    result+=1;  //레이저와 상관없이 쇠막대기가 1개더 쪼개지므로 +1
                    stack.pop();  //쇠막대기가 끝났으므로 stack에서 pop해준다

                }
            }
        }

        System.out.print(result);
    }

}