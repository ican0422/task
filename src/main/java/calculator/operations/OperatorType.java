package calculator.operations;

import calculator.CalculatorException;

public enum OperatorType {
    /* 더하기 */
    ADD('+'), // public static final OperatorType ADD = new 클래스('+');
    /* 빼기 */
    SUBTRACT('-'),
    /* 곱하기 */
    MULTIPLY('*'),
    /* 나누기 */
    DIVIDE('/'),
    /* 나머지 */
    MOD('%');

    public final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }
    public static OperatorType getOpertor(char operator) throws CalculatorException{
        for(OperatorType type : values()) {
            if(type.operator == operator){
                return type;
            }
        }
        throw new CalculatorException("기호를 입력해주세요.");
    }



}
