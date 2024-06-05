import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for(int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // 하나를 기준으로 두고
        // 양옆을 제외한 모든 숫자와 합을 구해
        // 그 중 최대값을 출력

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int sum = 0; 
            if(i == 0) {
                // i가 2부터 합하기 반복
                for(int j = 2; j < n; j++) {
                    sum = arr[i] + arr[j];
                    maxSum = Math.max(sum, maxSum);
                }
            } else if(i == n-1) {
                // i가 0부터 n-3까지 합하기
                for(int j = 0; j < n-2; j++) {
                    sum = arr[i] + arr[j];
                    maxSum = Math.max(sum, maxSum);
                }
            } else {
                // 양옆의 값을 제외한 모든 값과 합하기
                for(int j = 0; j < n; j++) {

                    if ( Math.abs(i-j) < 2) {
                        continue;
                    }
                    sum = arr[i] + arr[j];
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }
        System.out.println(maxSum);
    }
}