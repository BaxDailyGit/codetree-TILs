import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //System.out.println(a);
        //System.out.println(a.getClass().getName());
        // 단순히 0을 1로 바꾸는 전략은 
        // 만약 a가 1111 (15)로 나왔을때 하나를 바꾸면,
        // 정답은 1110 (14)이다. 

        // 완전 탐색으로 
        // 각 자릿수를 모두 바꿔가며 
        // 만들수 있는 경우의 수 중에서 
        // 가장 큰수를 반환

        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            //System.out.println(a.charAt(i));
            String trans_0 = a.substring(0,i) + '0' + a.substring(i+1);
            String trans_1 = a.substring(0,i) + '1' + a.substring(i+1);
            //System.out.println("trans_0: "+trans_0);
            //System.out.println("trans_1: "+trans_1);
            if(!a.equals(trans_0)) {
                list.add(trans_0);
            }
            if(!a.equals(trans_1)) {
                list.add(trans_1);
            }
        }
        
        List<Long> decimalList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            decimalList.add(Long.parseLong(list.get(i), 2));
        }

        System.out.println(Collections.max(decimalList));
        
        
        


    }
}