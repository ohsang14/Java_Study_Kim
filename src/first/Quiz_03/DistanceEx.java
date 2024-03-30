package first.Quiz_03;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("거리를 입력하세요: ");
        int distance = sc.nextInt();

        if (distance <= 1 ){
            System.out.println("출력: 도보를 이용하세요.");
        } else if (distance <= 5) {
            System.out.println("출력: 자전거를 이용하세요.");
        }else if (distance <= 100) {
            System.out.println("출력: 자동차를 이용하세요.");
        }else  {
            System.out.println("출력: 비행기를 이용하세요.");
        }
    }
}
