package first.Quiz_03;

import java.util.Scanner;

public class ExchangeRateEEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("달러를 입력하세요");
        int dollar = sc.nextInt();

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0) {
            int krw = dollar * 1300;
            System.out.println("환전된 금액은  " + krw + "원 입니다.");
        }
    }
}
