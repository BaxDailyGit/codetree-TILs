import java.util.*;
public class Main {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 세가지 중에서 거리 짧은것을 선택
        // 1. a -> b
        // 2. a -> x -순간이동-> y => b
        // 3. a -> y -순간이동-> x => b

        int minLength = Math.min(
                                Math.abs(a - b),
                                Math.min(
                                        Math.abs(a - x) + Math.abs(y - b),
                                        Math.abs(a - y) + Math.abs(x - b)
                                ));
        System.out.println(minLength);
    }
}