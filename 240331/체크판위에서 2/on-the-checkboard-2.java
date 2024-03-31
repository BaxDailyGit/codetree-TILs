import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c];
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // for(int i = 0; i < r; i++)  {
        //     for(int j = 0; j < c; j++)  {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        // 완전 탐색
        // i j k l 사용
        // i j 는 첫번째 B찾기
        // k l 는 첫번째 B찾기
        int cnt = 0;
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                if(arr[i][j] == 'B'){
                    //System.out.print(arr[i][j]+" ");
                    for(int k = i + 1; k < r - 1; k++)  {
                        for(int l = j + 1; l < c - 1; l++)  {
                            if (arr[k + 1][l] == 'B')   {
                                break;
                            }
                            //System.out.println(k+" "+l);
                            cnt ++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}