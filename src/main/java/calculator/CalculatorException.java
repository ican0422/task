package calculator;

public class CalculatorException extends RuntimeException{
    public CalculatorException(String type){
        super(type);
    }
}
