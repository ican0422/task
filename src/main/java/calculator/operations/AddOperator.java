package calculator.operations;

public class AddOperator implements OperatorInterface {
    @Override
    public double operate(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
