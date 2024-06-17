import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 선택정렬 구현
        int temp;
        for(int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i; j < n; j++) {
                // 최솟값 찾기
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}