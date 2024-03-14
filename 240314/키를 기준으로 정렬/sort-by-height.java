import java.util.*;
public class Main {
    public static void main(String[] args) {
        // n이 입력
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        // 주어진 n번만큼 이름, 키, 몸무게가 공백을 사이로 입력
        // 배열 먼저 선언
        String[] name = new String[n];
        int[] age = new int[n];
        int[] weight = new int[n];
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
            age[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        // 잘 입력됐는지 테스트
        // for(int i = 0; i < n; i++){
        //     System.out.println(name[i] + " " + age[i] + " " + weight[i]);
        // }

        // Human 클래스 정의
        class Human{
            String name;
            int age;
            int weight;

            public Human(String name, int age, int weight){
                this.name = name;
                this.age = age;
                this.weight = weight;
            }
        }
        // 크기 n인 humans 배열 선언
        Human[] humans = new Human[n];
        // 각 human 객체 생성 후 humans 배열에 insert 반복
        for(int i = 0; i < n; i++){
            Human human = new Human(name[i],age[i],weight[i]);
            humans[i] = human;
        }   
        // 키 기준으로 정렬
        Arrays.sort(humans, (a,b) -> a.age - b.age);
        // 출력
        for(int i = 0; i < n; i++){
            System.out.println(humans[i].name + " " + humans[i].age + " " + humans[i].weight);
        }

    }
}