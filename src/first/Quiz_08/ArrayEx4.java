package first.Quiz_08;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / 5;


        System.out.println("평균: " + average);
        System.out.println("합: " + sum);


    }

}

