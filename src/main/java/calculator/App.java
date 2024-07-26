package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* 스캐너 호출 */
        Scanner sc = new Scanner(System.in);

        /* 클래스 호출 */
        Calculator ca = new Calculator();
        CircleCalculator cc = new CircleCalculator();

        /* 반복 계산 구현 */
        boolean isRunning = true;
        while (isRunning) {

            /* 사칙연산과 원의 넓이 구하는 조건 받기 */
            System.out.println("사칙연산 1번, 원의 넓이 구하기 2번");
            int caseNum = sc.nextInt();

            /* 사칙연산 */
            if (caseNum == 1){
                /* 첫 번째 입력 값 받기 */
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                /* 사칙연산 기호 받기 */
                System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
                char operator = sc.next().charAt(0);

                /* 두 번째 입력 값 받기 */
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                /* 버퍼 초기화 */
                sc.nextLine();

                /* 연산 함수 */
                int sum = ca.calculate(num1,num2,operator);

                /* 결과 도출 */
                System.out.println("결과 : " + sum);

                /* 결과 List 배열 저장 메서드*/
                ca.results(sum);


            }
            /* 원 넓이 구하는 연산 */
            if (caseNum == 2){
                /* 구하고 싶은 원의 반지름 */
                System.out.print("원의 넓이를 구하고 싶은 원의 반지름을 입력하세요 : ");
                double num = sc.nextDouble();

                /* 버퍼 초기화 */
                sc.nextLine();

                /* 원의 넓이 연산 */
                double circleArea = cc.calculateCircleArea(num);

                /* 원의 넓이 결과 도출 */
                System.out.println("원의 넓이 : " + circleArea + " cm^2");

                /* 결과 List 배열 저장 메서드*/
                cc.circleAreaResults(circleArea);
            }

            /* 연산 결과 삭제 함수 */
            System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까? (remove 입력)");
            String remove = sc.nextLine();
            /* 사칙연산 결과 삭제 */
            if(caseNum == 1){
                ca.remove(remove);
            }
            /* 원의 넓이 결과 삭제 */
            if (caseNum == 2){
                cc.circleAreaRemove(remove);
            }


            /* 저장된 연산 결과 전부 조회 함수*/
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            /* 사칙연산 결과들 조회 */
            if(caseNum == 1){
                ca.inquiry(inquiry);
            }
            /* 원의 넓이 결과들 조회 */
            if(caseNum == 2){
                cc.circleAreaInquiry(inquiry);
            }


            /* 종료 여부 확인 */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();

            /* 종료 제어문 */
            if (exit.equals("exit")) {
                System.out.println("계산을 종료 하셨습니다.");
                isRunning = false;
            }
        }
    }
}
