import java.util.*;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 3명의 사람이 일직선 위에 있음
        // 양쪽 끝에 있는 사람중 하나를 골라
        // 남은 두명 사이로 이동시키는것을 반복
        // 이때 연속된 숫자가 되도록 만드는 최소 이동 횟수 구하기


        // 케이스
        // 1. 3명 모두 이미 연속된 숫자로 서있는 경우
        // 2. 2명이 이미 연속된 숫자로 서있는 경우
        // 3. 아무도 연속된 숫자로 서있지 않는 경우


        // 1.
        // 리스트에 넣고 정렬
        // 각 요소별 하나씩 빼서 1나오면\
        // 0을 출력한다.
        List<Integer> list = new ArrayList<>(); 
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        if((list.get(0) - list.get(1) == -1) && (list.get(1) - list.get(2) == -1)) {
            System.out.println(0);
            return;
        }


        // 2.
        if((list.get(0) - list.get(1) == -1) ) {
            if(list.get(2) - list.get(1) < 3) {
                System.out.println(1);
                return;
            } else {
                System.out.println(2);
                return;
            }
        } else if((list.get(1) - list.get(2) == -1)) {
            if(list.get(1) - list.get(0) < 3) {
                System.out.println(1);
                return;
            } else {
                System.out.println(2);
                return;
            }
        }

        // 3.

    }
}