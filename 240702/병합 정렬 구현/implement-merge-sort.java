import java.util.*;
public class Main {
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // 중간 인덱스
        int mid = (left + right) / 2;

        // 왼쪽 정렬
        sort(arr, left, mid);
        // 오른쪽 정렬
        sort(arr, mid + 1, right);

        // 배열 합치기
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // 왼쪽 배열의 길이
        int n2 = right - mid; // 오른쪽 배열의 길이

        // 왼쪽 배열 오른쪽 배열
        int[] leftTemp = new int[n1];
        int[] rightTemp = new int[n2];

        // 왼쪽 배열 담기
        for (int i = 0; i < n1; i++) {
            leftTemp[i] = arr[left + i];
        }

        // 오른쪽 배열 담기
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = arr[mid + 1 + i];
        }

        // 왼쪽 배열과 오른쪽 배열의 인덱스
        int i = 0, j = 0;
        // 원본 배열 arr의 시작 인덱스
        int k = left;

        // 원본 배열에 정렬
        while (i < n1 && j < n2) {
            if (leftTemp[i] <= rightTemp[j]) {
                arr[k] = leftTemp[i];
                i++;
            } else {
                arr[k] = rightTemp[j];
                j++;
            }
            k++;
        }

        // 남아 있는 요소 담기
        while (i < n1) {
            arr[k] = leftTemp[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightTemp[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}