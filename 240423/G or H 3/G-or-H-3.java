import java.util.*;

public class Main {
    public static void main(String[] args) {
        // N 명의 사람들이 G 혹은 H 팻말을 들고 일직선으로 서있음.
        // 크기가 K인 사진을 찍었을때
        // G가 찍히면 1점씩 얻고 H가 찍히면 2점씩 얻음.
        // 사진을 찍을때 나올수 있는 최대 점수를 구하기

        // 이때 사진의 크기는 양쪽 끝에 있는 X값끼리의 차
        // 예를 들어 양쪽 끝에 있는 X값이 [1,5]면 K는 4

        

        //입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람수
        int K = sc.nextInt(); // 사진 크기 
        int[] arr = new int[N]; // 사람이 서있는 위치
        char[] alphabet = new char[N]; // 그 위치의 사람이 들고 있는 팻말
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            alphabet[i] = sc.next().charAt(0);
        }

        // 사람이 서있는 위치 최댓값 찾기
        int maxLocation = 0;
        for(int e : arr){
            maxLocation = Math.max(maxLocation, e);
        }

        // 위치에 해당하는 점수를 가지는 배열 만들기
        int[] placed = new int[maxLocation + 1];

        for(int i = 0; i < N; i++) {
            if(alphabet[i] == 'G') {
                placed[arr[i]] = 1;
            }
            else if(alphabet[i] == 'H') {
                placed[arr[i]] = 2;
            }
        }

        // 최대 점수를 얻는 크기 찾기
        int maxSum = 0;
        for(int i = 1; i < maxLocation - K + 1; i++) {
            //System.out.println("i: " + i);
            int sum = 0;
            for(int j = i; j < i + K + 1; j++) {
                //System.out.println("    j: " + j);
                sum += placed[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}