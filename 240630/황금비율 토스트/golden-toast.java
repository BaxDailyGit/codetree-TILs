import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static int n, m;
    public static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.next();

        // 연결리스트 정의
        LinkedList<Character> l = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));
        }
        // Iterator 정의
        ListIterator<Character> it = l.listIterator(l.size());

        while(m-- > 0) {
            char command = sc.next().charAt(0);

            if(command == 'L') {
                if(it.hasPrevious())
                    it.previous();
            }
            else if(command == 'R') {
                if(it.hasNext())
                    it.next();
            }
            else if(command == 'D') {
                if(it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
            else if(command == 'P') {
                char c = sc.next().charAt(0);
                it.add(c);
            }
        }

        // 출력:
        it = l.listIterator();
        while(it.hasNext())
            System.out.print(it.next());

    }
}