package assignment5.strategy;

public final class DivideStrategy implements OperationStrategy {
    @Override
    public double calculate(double left, double right) {
        if (right == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return left / right;
    }
}
