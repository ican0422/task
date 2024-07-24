package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 반복 계산 구현 */
        boolean isRunning = true;

        while (isRunning) {

            /* 입력 값 받기 */
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            /* 사칙연산 기호 받기 */
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            /* 버퍼 초기화 */
            sc.nextLine();

            /* 계산결과 변수 초기화 */
            int sum = 0;
            /* 사칙 연산 제어문 */
            if(operator == '+') {
                sum = num1 + num2;
            }
            if(operator == '-') {
                sum = num1 - num2;
            }
            if(operator == '*') {
                sum = num1 * num2;
            }
            if(operator == '/') {
                sum = num1 / num2;
            }
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("올바르지 않은 기호를 입력하셨습니다.");
                sum = 0;
            }
            /* 결과 도출 */
            System.out.println("결과 : " + sum);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();

            if (exit.equals("exit")) {
                System.out.println("계산을 종료 하셨습니다.");
                return;
            }
        }
    }
}
