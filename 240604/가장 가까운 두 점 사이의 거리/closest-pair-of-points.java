import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        int[][] dot = new int[n][2];
        for(int i = 0; i < n; i++) {
            dot[i][0] = sc.nextInt();
            dot[i][1] = sc.nextInt();
        }
        // for(int i = 0; i < n; i++) {
        //     System.out.println(dot[i][0]+", "+dot[i][1]);
        // }


        // 가장 가까운 두 점 사이에 거리에 제곱을 한 값을 구하라
        // => 모든 점 사이의 거리에 제곱한 값의 최솟값을 반환
        // => 모든 점 사이의 (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)의 최솟값을 반환
        // => 완전 탐색

        int minLenSquare = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) { // 기준 점 dot[i]
            for(int j = i + 1; j < n; j++) { // 거리 구할 대상 점 dot[j]
                int lenSquare = 0;
                lenSquare = (dot[i][0] - dot[j][0]) * (dot[i][0] - dot[j][0]) + (dot[i][1] - dot[j][1]) * (dot[i][1] - dot[j][1]);
                //System.out.println("길이의 제곱: " + lenSquare);
                minLenSquare = Math.min(lenSquare, minLenSquare);
                }
        }
        System.out.println(minLenSquare);
    }
}