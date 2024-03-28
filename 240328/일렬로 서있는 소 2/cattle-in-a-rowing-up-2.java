import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 1부터 n까지 줄 서있는 소
        // 각 서의 키는 a(i)

        //입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxCnt = 0;

        // 완전탐색
        // 3마리를 소를 뽑았는데
        // 이소들이 순서 i < j < k를 만족하며 
        // 동시에 a(i) < a(j) < a(k)를 만족
        //서로 다른 쌍의 수 구하는 문제 (cnt구하기)
        for (int i = 0; i < n; i ++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] <= a[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (a[j] <= a[k]) {
                            maxCnt ++;
                        }
                    }
                }
            }
        }
        System.out.println(maxCnt);
    }
}