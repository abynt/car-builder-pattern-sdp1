package assignment5.strategy;

import java.util.Objects;

public final class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = requireStrategy(strategy);
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = requireStrategy(strategy);
    }

    public double calculate(double left, double right) {
        return strategy.calculate(left, right);
    }

    private static OperationStrategy requireStrategy(OperationStrategy strategy) {
        return Objects.requireNonNull(strategy, "Strategy must not be null");
    }
}
