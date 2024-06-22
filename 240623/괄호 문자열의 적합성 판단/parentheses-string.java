import java.util.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        // 스택을 활용한 괄호 적합성 판단
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < inputStr.length(); i++) {
            
            if(inputStr.charAt(i) == '(') {
                s.push(inputStr.charAt(i));
            } else if (inputStr.charAt(i) == ')') {
                s.pop();
            } else {
                System.out.println("No");
                return;
            }
            
        }
        if(s.empty() == false) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}