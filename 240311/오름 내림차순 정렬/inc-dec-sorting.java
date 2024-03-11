import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        // System.out.println(n);

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for(int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        //for문을 거꾸로 하면 되지만 여기선 스트림과 컬렉션 사용하겠음.
        Integer[] arr2 = Arrays.stream(arr)
                                        .boxed()
                                        .toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}