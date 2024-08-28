package string.calculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] parts = numbers.split("\n");
        String separator = ",";
        if (parts[0].startsWith("//")) {
            separator = parts[0].substring(2);
            parts = parts[1].split(separator);
        } else {
            parts = numbers.replace("\n", separator).split(separator);
        }

        int sum = 0;
        StringBuilder negatives = new StringBuilder();
        for (String part : parts) {
            int number = Integer.parseInt(part);
            if (number < 0) {
                negatives.append(number).append(" ");
            } else if (number <= 1000) {
                sum += number;
            }
        }

        if (negatives.length() > 0) {
            throw new RuntimeException("negatives not allowed: " + negatives.toString().trim());
        }

        return sum;
    }

    public int subtract(String numbers) {
        String[] parts = numbers.split(",");
        int result = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            result -= Integer.parseInt(parts[i]);
        }
        return result;
    }

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