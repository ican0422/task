package calculator;

public class CalculatorException extends RuntimeException{
    public CalculatorException(){
        super("나눗셈 분모에 0 혹은 기호가 다릅니다.");
    }

}
