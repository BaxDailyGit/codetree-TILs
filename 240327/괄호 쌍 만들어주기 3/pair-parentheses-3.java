import java.util.*;
public class Main {
    public static int maxssang = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 최대로 나올수 있는 쌍의 개수를 구하는 문제
        // '('가 나왔을때 ')'의 개수 찾기
        // 다음 '('가 나왔을때 ')'의 개수 찾기

        Scanner sc = new Scanner(System.in);
        String galho = sc.next();
        int cnt = 0;
        for(int i = 0; i < galho.length(); i++){
            if(Character.toString(galho.charAt(i)).equals("(")){
                //System.out.println("( 찾음");
                for(int j = i + 1; j < galho.length(); j++){
                    if(Character.toString(galho.charAt(j)).equals(")")){
                        //System.out.println(") 찾음");
                        cnt++;
                        //System.out.println(cnt);
                    }
                }
            }
            //System.out.println("");
        }
        System.out.println(cnt);

    }
}