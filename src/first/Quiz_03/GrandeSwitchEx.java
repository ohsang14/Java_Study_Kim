package first.Quiz_03;

import java.util.Scanner;

public class GrandeSwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학점을 입력하세요");
        String grade = sc.nextLine();

        switch (grade){
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("좋은");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못 입력함");
            }
    }
}
