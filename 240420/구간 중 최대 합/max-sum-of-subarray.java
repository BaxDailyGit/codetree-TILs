import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 먼저 기준점 순회하기
        // 기준점 기준으로 연속해서 k개를 합하고
        // 최대값 구하면 됨.

        int maxSum = 0;
        for(int i = 0; i < n - k + 1 ; i++) {
            //System.out.println("arr[i]: " + arr[i]);
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                //System.out.println("    arr[j]: " + arr[j]);
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}