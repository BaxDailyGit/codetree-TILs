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

        if(arr[0][0]=='W') {
        // 예외
        int bCnt = 0;
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                if(arr[i][j] == 'B'){
                    bCnt++;
                }
            }
        }
        if (bCnt > 2) {
            System.out.println(0);
        }
        else {
        int cnt = 0;
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                if(arr[i][j] == 'B'){
                    //System.out.print(arr[i][j]+" ");
                    for(int k = i + 1; k < r - 1; k++)  {
                        for(int l = j + 1; l < c - 1; l++)  {
                            cnt ++;
                            if (arr[k + 1][l + 1] == 'B')   {
                                break;
                            }
                            //System.out.println(k+" "+l);
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
        }
        }
        else {
        // 예외
        int bCnt = 0;
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                if(arr[i][j] == 'W'){
                    bCnt++;
                }
            }
        }
        if (bCnt > 2) {
            System.out.println(0);
        }
        else {
        int cnt = 0;
        for(int i = 0; i < r; i++)  {
            for(int j = 0; j < c; j++)  {
                if(arr[i][j] == 'W'){
                    //System.out.print(arr[i][j]+" ");
                    for(int k = i + 1; k < r - 1; k++)  {
                        for(int l = j + 1; l < c - 1; l++)  {
                            cnt ++;
                            if (arr[k + 1][l + 1] == 'W')   {
                                break;
                            }
                            //System.out.println(k+" "+l);
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
        }
        }
        
        








    }
}