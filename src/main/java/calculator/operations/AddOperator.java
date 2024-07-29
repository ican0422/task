package calculator.operations;

public class AddOperator implements OperatorInterface {
    @Override
    public double operate(int num1, int num2) {
        return num1 + num2;
    }
}
