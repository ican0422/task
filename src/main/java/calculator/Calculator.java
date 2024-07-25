package calculator;

import java.util.ArrayList;

public class Calculator {
    /* ArrayList 호출 및 캡슐화 */
    private ArrayList<Integer> results;

    /* 계산결과 변수 초기화 */
    int sum = 0;

    /* 생성자 초기화 */
    public Calculator(){
        results = new ArrayList<>();
    }

    /* 연산 메서드 */
    public int calculate(int num1, int num2, char operator){

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

    /* 연산 결과 저장 메서드 */
    public ArrayList<Integer> results(int sum) {
        /* 결과 List 배열 저장 */
        results.add(sum);

        return results;
    }

    /* 연산 결과 가장 먼저 입력된 수를 삭제하는 메서드 */
    public void remove(String remove){
        if (remove.equals("remove")){
            results.remove(0);
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }

    /* 저장된 연산 결과 출력하는 메서드 */
    public void inquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + results.toString());
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }

    /* ArrayList 변수 캡슐화 */
    public ArrayList<Integer> getResults(){
        return results;
    }
    public void setResults(ArrayList<Integer> results){
        this.results = results;
    }

}
