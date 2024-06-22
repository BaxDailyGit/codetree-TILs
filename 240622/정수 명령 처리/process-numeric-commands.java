import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 커스텀 스택 구현
        Stack<Integer> s = new Stack<>();
        
        
        for(int i = 0; i < n; i++) {
            String inputStr = sc.next();
            if(inputStr.equals("push")) {
                s.push(sc. nextInt());
            } else if(inputStr.equals("size")) {
                System.out.println(s.size());
            } else if(inputStr.equals("empty")) {
                if(s.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(inputStr.equals("pop")) {
                System.out.println(s.peek());
                s.pop();
            } 
        }

    }
}