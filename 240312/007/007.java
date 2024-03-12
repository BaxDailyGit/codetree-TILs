import java.util.*;

public class Main {
    public static class Info{
        String secret_code = new String();
        char meeting_point;
        int time;

        public Info(String secret_code, char meeting_point, int time){
            this.secret_code = secret_code;
            this.meeting_point = meeting_point;
            this.time = time;
        }

        public void sout(){
            secret_code = this.secret_code;
            meeting_point = this.meeting_point;
            time = this.time;
            System.out.println("secret code : " + secret_code);
            System.out.println("meeting point : " + meeting_point);
            System.out.println("time : " + time);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secret_code = new String();
        char meeting_point;
        int time;

        secret_code = sc.next();
        meeting_point = sc.next().charAt(0);
        time = sc.nextInt();

        Info first = new Info(secret_code, meeting_point, time);
        
        first.sout();
    }
}