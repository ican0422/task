package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* 스캐너 호출 */
        Scanner sc = new Scanner(System.in);

        /* 클래스 호출 */
        ArithmeticCalculator ac = new ArithmeticCalculator();
        CircleCalculator cc = new CircleCalculator();

        /* 반복 계산 구현 */
        boolean isRunning = true;

        while (isRunning) {

            /* 사칙연산과 원의 넓이 구하는 조건 받기 */
            System.out.println("사칙연산 1번, 원의 넓이 구하기 2번");
            int caseNum = sc.nextInt();

            /* 사칙연산 */
            if (caseNum == 1){
                while (true){
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

                    /* 연산 시작 */
                    try {
                        double sum = ac.calculate(num1,num2,operator);

                        /* 결과 도출 */
                        System.out.println("결과 : " + sum);

                        break;
                    } catch (CalculatorException e) {
                        System.out.println(e.getMessage());

                        /* 계산을 종료하는지 물어보는 문구 출력 및 대답 듣기 */
                        System.out.print(" 계산을 종료 하시겠습니까? (y 또는 n를 입력하시면 입력해주세요.) : ");
                        String exit_start = sc.nextLine();

                        /* 만약 y 혹은 Y를 입력하면 계산 종료 */
                        if (exit_start.equals("y") || exit_start.equals("Y")){
                            return;
                        }
                    }
                }
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
            }

            /* 연산 결과 삭제 함수 */
            System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까? (remove 입력)");
            String remove = sc.nextLine();
            /* 사칙연산 결과 삭제 */
            if(caseNum == 1){
                ac.remove(remove);
            }
            /* 원의 넓이 결과 삭제 */
            if (caseNum == 2){
                cc.remove(remove);
            }


            /* 저장된 연산 결과 전부 조회 함수*/
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            /* 사칙연산 결과들 조회 */
            if(caseNum == 1){
                ac.inquiry(inquiry);
            }
            /* 원의 넓이 결과들 조회 */
            if(caseNum == 2){
                cc.inquiry(inquiry);
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
