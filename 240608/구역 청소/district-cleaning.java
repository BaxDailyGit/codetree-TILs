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
        for(int i = a+1; i <= b; i++) {
            arr[i] = 1;
        }
        for(int i = c+1; i <= d; i++) {
            arr[i] = 1;
        }
        int sum = 0;
        for(int i = 0; i < 101; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}