import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 총 N명
        int K = sc.nextInt(); // 사진의 크기(범위) K

        int[] arr = new int[N + 1]; // 위치 정보가 들어있는 넘버
        char[]  alpha = new char[N + 1]; // 위치 정보에 해당하는 인덱스안에 알파벳값
        for(int i = 1; i < N + 1; i++) {
            arr[i] = sc.nextInt();
            alpha[i] = sc.next().charAt(0);    
        }

        // 각 위치에 점수 등록
        int[] placed = new int[10001];
        for(int i = 1; i < N + 1; i++) {
            if(alpha[i] == 'G') {
                placed[arr[i]] = 1;
            }
            else if(alpha[i] == 'H') {
                placed[arr[i]] = 2;
            }
        }

        int max = 0; // arr변수중 최댓값 (위치정보의 최댓값)
        for (int i : arr) {
            max = Math.max(max, i);
        }
        //System.out.println(max);
        
        // 순회하며 사진을 찍어 얻을 수 있는 최대 점수 찾기        
        int maxSum = 0;
        for(int i = 1; i <= max - K; i++) {
            //System.out.println("i: "+i);
            int sum = 0;
            for(int j = i; j <= i + K; j++) {
                //System.out.println("    placed["+j+"]: "+placed[j]);
                sum += placed[j];
            }
            maxSum = Math.max(maxSum, sum);
            
        }
        System.out.println(maxSum);
    }
}