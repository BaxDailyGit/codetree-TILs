import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        int[] counting = new int[101];
        for(int i = x1; i <= x2; i++) {
            counting[i]++;
        }
        for(int i = x3; i <= x4; i++) {
            counting[i]++;
        }
        int intersecting = 0; 
        for(int i = 1; i < 101; i++) {
            if (counting[i] > 1) {
                intersecting = 1;
                break;
            }
        }
        if(intersecting == 1) {
            System.out.println("intersecting");
        } else {
            System.out.println("nonintersecting");
        }
        
    }
}