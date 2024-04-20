import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.println(str);

        // 연속된 "((" 찾으면 연속된 "))" 개수 더하고,
        // 다음 연속된 "((" 찾으면 연속된 "))" 개수 더하고,
        // 반복

        int cnt = 0;
        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) == '(') {
                //System.out.println("((찾음");
                for (int j = i + 2 ; j < str.length()-1; j++) {
                    if(str.charAt(j) == ')' && str.charAt(j+1) == ')') {
                        //System.out.println("    ))찾음");
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}