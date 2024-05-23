import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력 주어진 숫자 N, 주어진 조합 ( , , )
        // 임의의 조합에서 자리수와 주어진 조합의 자리수를 비교해서
        // 한 자리라도 차이가 2 이하이면 cnt++ 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int cnt = 0;

        for(int i = 1; i <= N; i ++) {
            for(int j = 1; j <= N; j++) {
                for(int k = 1; k <= N; k ++) {
                    if( (Math.abs(i - first) <= 2) || (Math.abs(j - second) <= 2) || (Math.abs(k - third) <= 2) ) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}