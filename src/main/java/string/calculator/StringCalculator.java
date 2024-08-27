package string.calculator;

public class StringCalculator {

    public int multiply(String numbers) {
        String[] parts = numbers.split(",");
        int result = 1;
        for (String part : parts) {
            result *= Integer.parseInt(part);
        }
        return result;
    }

    public double divide(String numbers) {
        String[] parts = numbers.split(",");
        double result = Double.parseDouble(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            result /= Double.parseDouble(parts[i]);
        }
        return result;
    }
}
