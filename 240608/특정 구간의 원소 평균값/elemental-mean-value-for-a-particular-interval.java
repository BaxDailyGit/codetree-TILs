import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        // 구간 정해서 구간에 있는 원소들을 모두 더해서 평균 구하고 
        // 그 구간안에 동일한 원소가 있으면 cnt++
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            //System.out.println("-----------");
            for(int j = i; j < n; j++) {
                double sumEle = 0;
                double cntEle = 0;
                for(int k = i; k <= j; k++) {
                    sumEle += arr[k];
                    cntEle++;
                }
                double avg = sumEle / cntEle;
                //System.out.println(avg + " = " + sumEle + "/" + cntEle);
                for(int k = i; k <= j; k++) {
                    if(avg == arr[k]) {
                        //System.out.println("    -->" + avg + " == " + arr[k]);
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}