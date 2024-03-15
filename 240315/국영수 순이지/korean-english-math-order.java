import java.util.*;
public class Main {
    public static void main(String[] args) {
        //student 클래스 정의
        class Student implements Comparable<Student> {
            String name;
            int kor, eng, math;
            Student (String name, int kor, int eng, int math){
                this.name = name;
                this.kor = kor;
                this.eng = eng;
                this.math = math;
            }

            @Override
            public int compareTo(Student student){
                if(this.kor == student.kor){
                    if(this.eng == student.eng){
                        return student.math - this.math;
                    }
                    return student.eng - this.eng;
                }
                return student.kor - this.kor;
            }

        }

        //n 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //students 배열 선언
        Student[] students = new Student[n]; 
        //반복문 안에서 
        //student 객체 생성하고 students[i]에 insert
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }
        //정렬
        Arrays.sort(students);
        //출력
        for(int i = 0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }
    }
}