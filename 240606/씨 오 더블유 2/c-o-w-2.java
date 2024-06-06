import java.util.*;
public class Main {
    public static void main(String[] args) {
        // c와 o와 w를 순서대로 세는 가짓 수 출력하는 문제
        // 완전탐색

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        String str = sc.next();
        // System.out.println(str);

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (str.charAt(i) == 'C') {
                for(int j = 0; j < n; j++) {
                    if(str.charAt(j) == 'O') {
                        for(int k = 0; k < n; k++) {
                            if(str.charAt(k) == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }    
        }
        System.out.println(cnt);
    }
}