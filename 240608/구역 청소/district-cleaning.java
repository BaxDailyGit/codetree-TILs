import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[101];
        for(int i = a; i < b; i++) {
            arr[i] = 1;
        }
        for(int i = c; i < d; i++) {
            arr[i] = 1;
        }
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}