import java.util.*;

public class Main {
    public static void swap(int n, int m){
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println(n+ " "+ m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        //System.out.println(n+" "+m);
        swap(n,m);
    }
}