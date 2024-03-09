import java.util.*;
class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void swap(IntWrapper n, IntWrapper m){
        int temp;
        temp = n.value;
        n.value = m.value;
        m.value = temp;
        //System.out.println("swap함수 내부 코드 실행후: " + n.value + " " + m.value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();        
        //System.out.println("swap 실행 전: " + n + " " + m);

        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);

        swap(nWrapper,mWrapper);

        //System.out.println("swap 실행 후: " + nWrapper.value + " " + mWrapper.value);
        System.out.println(nWrapper+" "+mWrapper);
    }
}