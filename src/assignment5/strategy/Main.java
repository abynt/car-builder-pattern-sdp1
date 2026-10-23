package assignment5.strategy;

public class Main {
    public static void main(String[] args) {
        double left = 12.0;
        double right = 5.0;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.printf("%.1f + %.1f = %.1f\n", left, right, calculator.calculate(left, right));

        calculator.setStrategy(new SubtractStrategy());
        System.out.printf("%.1f - %.1f = %.1f\n", left, right, calculator.calculate(left, right));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.printf("%.1f * %.1f = %.1f\n", left, right, calculator.calculate(left, right));

        calculator.setStrategy(new DivideStrategy());
        System.out.printf("%.1f / %.1f = %.1f", left, right, calculator.calculate(left, right));
    }
}
