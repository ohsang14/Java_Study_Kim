package first.Quiz_08;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3개의 정수를 입력하세요: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + " 개의 정수를 구하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / count;

        System.out.println("합 " + sum);
        System.out.println("평균 " + average);
    }
}
