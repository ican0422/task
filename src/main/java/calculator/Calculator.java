package calculator;

import java.util.ArrayList;

public abstract class Calculator {
    /* ArrayList 호출 및 캡슐화 */
    protected ArrayList<Double> results;

    /* 생성자 초기화 */
    public Calculator(){
        results = new ArrayList<>();
    }

    /* 사용자 입력타입 제네릭 형식으로 나누기 */
    public static Number parseNumber(String input) throws CalculatorException{
        try {
            if(input.contains(".")) {
                return Double.parseDouble(input);
            } else {
                return Integer.parseInt(input);
            }
        } catch (CalculatorException e){
            throw new CalculatorException("유효한 숫자를 입력하세요.");
        }
    }

    /* 연산 결과 가장 먼저 입력된 수를 삭제하는 메서드 */
    public abstract void remove(String remove);

    /* 저장된 연산 결과 출력하는 메서드 */
    public abstract void inquiry(String inquiry);
}
