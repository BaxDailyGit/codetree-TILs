import java.util.*;

public class Main {
    public static void main(String[] args) {
        //단순히 시계를 만드는것이 아닌 
        //0시00분을 기준으로
        //처음시간과 끝시간을 빼는식으로 하자

        int h_begin;
        int m_begin;
        int h_end;
        int m_end;
        Scanner sc = new Scanner(System.in);
        h_begin = sc.nextInt();
        m_begin = sc.nextInt();
        h_end = sc.nextInt();
        m_end = sc.nextInt();

        int sum_b;
        int sum_e;

        sum_b = h_begin*60 + m_begin;
        sum_e = h_end*60 + m_end;
        
        int diff = Math.abs(sum_b - sum_e);
        
        System.out.println(diff);
    }
}