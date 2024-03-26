import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // n개의 집이 x = 1에서 x = n까지 순서대로 놓여있고
        // 각각 A_i명이 살고있다.
        // n개의 집 중 한 곳에 전부 모인다.
        // 모든 사람들의 이동 거리의 합이 최소가 되도록하기.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int minSumDistance = INT_MAX;
        //System.out.println("minSumDistance "+minSumDistance);
        // i=0에서 모였을때
        int meet;
        for (int i = 0; i < n; i++){
            meet = i;
            int sumDistance = 0;
            for (int j = 0; j < n; j++){
                sumDistance += Math.abs((j-meet+1) * a[j]);
                //System.out.println("sumDistance "+sumDistance);
            }
            minSumDistance = Math.min(minSumDistance, sumDistance);
            //System.out.println("minSumDistance "+minSumDistance);
        }
        System.out.println(minSumDistance);


    }
}