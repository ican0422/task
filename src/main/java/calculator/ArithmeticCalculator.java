package calculator;

import calculator.operations.*;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    /* 생성자 초기화 */
    public ArithmeticCalculator(){
        super();
    }

    /* 계산결과 변수 초기화 */
    double sum = 0;
    /* 연산 메서드 */
    public <T extends Number> double calculate(Number num1, Number num2, char operator) throws CalculatorException{
        /* 기호 Enum 가져오기 */
        OperatorType op = OperatorType.getOpertor(operator);

        /* 사칙 연산 제어문 */
        if(op == OperatorType.ADD) {
           AddOperator add = new AddOperator();
           sum = add.operate(num1,num2);
        }
        if(op == OperatorType.SUBTRACT) {
            SubtractOperator sub = new SubtractOperator();
            sum = sub.operate(num1,num2);
        }
        if(op == OperatorType.MULTIPLY) {
            MultiplyOperator mul = new MultiplyOperator();
            sum = mul.operate(num1,num2);
        }
        if(op == OperatorType.DIVIDE) {
            DivideOperator div = new DivideOperator();
            /* 분모가 0이면 예외처리 메세지 보여준다. */
            if(num2.doubleValue() == 0){
                throw  new CalculatorException("분모가 0 입니다.");
            }
            sum = div.operate(num1,num2);
        }
        if(op == OperatorType.MOD){
            ModOperator mod = new ModOperator();
            sum = mod.operate(num1, num2);
        }
        /* 기호 외에 다른 것이 들어오면 예외처리 메세지를 보여준다. */
        if(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
            throw  new CalculatorException("맞지 않는 연산 기호를 입력하셨습니다.");
        }

        /* 연산 값 리스트에 저장 */
        results.add(sum);

        return sum;
    }

    /* 삭제 */
    @Override
    public void remove(String remove){
        if (remove.equals("remove")){
            results.remove(0);
        } else {
            System.out.println("삭제 하지 않습니다.");
        }
    }

    /* 조회 */
    @Override
    public void inquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + results.toString());
        } else {
            System.out.println("출력 하지 않습니다.");
        }
    }

    /* 람다식 적용 결과 보다 저장된 더 큰 수 조회 */
    @Override
    public void lam(double sum) {
        results.stream().filter( i -> sum < i).forEach(System.out::println);
    }

    /* ArrayList 변수 캡슐화 */
    public ArrayList<Double> getResults(){
        return results;
    }
    public void setResults(ArrayList<Double> results){
        this.results = results;
    }
}
