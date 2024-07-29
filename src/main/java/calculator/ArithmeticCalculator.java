package calculator;

import calculator.operations.AddOperator;
import calculator.operations.DivideOperator;
import calculator.operations.MultiplyOperator;
import calculator.operations.SubtractOperator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    /* 생성자 초기화 */
    public ArithmeticCalculator(AddOperator addOperator,
                                SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator,
                                DivideOperator divideOperator){
        super();
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    /* 계산결과 변수 초기화 */
    double sum = 0;

    /* 연산 메서드 */
    public double calculate(int num1, int num2, char operator) throws CalculatorException{

        /* 사칙 연산 제어문 */
        if(operator == '+') {
            sum = addOperator.operate(num1,num2);
        }
        if(operator == '-') {
            sum = subtractOperator.operate(num1,num2);
        }
        if(operator == '*') {
            sum = multiplyOperator.operate(num1,num2);
        }
        if(operator == '/') {
            /* 분모가 0이면 예외처리 메세지 보여준다. */
            if(num2 == 0){
                throw  new CalculatorException("분모가 0 입니다.");
            }
            sum = divideOperator.operate(num1,num2);
        }
        /* 기호 외에 다른 것이 들어오면 예외처리 메세지를 보여준다. */
        if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw  new CalculatorException("맞지 않는 연산 기호를 입력하셨습니다.");
        }

        /* 연산 값 리스트에 저장 */
        results.add(sum);

        return sum;
    }

    @Override
    public void remove(String remove){
        if (remove.equals("remove")){
            results.remove(0);
        } else {
            System.out.println("삭제 하지 않습니다.");
        }
    }

    @Override
    public void inquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + results.toString());
        } else {
            System.out.println("출력 하지 않습니다.");
        }
    }

    /* ArrayList 변수 캡슐화 */
    public ArrayList<Double> getResults(){
        return results;
    }
    public void setResults(ArrayList<Double> results){
        this.results = results;
    }
}
