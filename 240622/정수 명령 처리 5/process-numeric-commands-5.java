import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령어 수
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String inputStr = sc.next(); // 입력 명령어
            if(inputStr.equals("push_back")) {
                list.add(sc.nextInt());
            }
            else if(inputStr.equals("get")) {
                System.out.println(list.get(sc.nextInt() - 1));
            }
            else if(inputStr.equals("size")) {
                System.out.println(list.size());
            }
            if(inputStr.equals("pop_back")) {
                list.remove(list.size() -1);
            }
        }



    }
}