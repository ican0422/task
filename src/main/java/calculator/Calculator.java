package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> results = new ArrayList<Integer>();
    public int calculate(int num1, int num2, char operator){

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

        return sum;
    }

    public ArrayList<Integer> getResults(int sum) {

        /* 결과 List 배열 저장 */
        results.add(sum);

        return results;
    }

    public void remove(String remove){
        if (remove.equals("remove")){
            results.remove(0);
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }

    public void inquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + results.toString());
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }
}
