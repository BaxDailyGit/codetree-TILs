import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 커스텀 큐 구현
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            String inputStr = sc.next();
            if(inputStr.equals("push")) {
                q.add(sc.nextInt());
            } else if(inputStr.equals("pop")) {
                if(q.isEmpty()) {
                    return;
                }
                System.out.println(q.poll());
            } else if(inputStr.equals("size")) {
                System.out.println(q.size());
            } else if(inputStr.equals("empty")) {
                if (q.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(inputStr.equals("front")) {
                System.out.println(q.peek());
            }
        }

    }
}