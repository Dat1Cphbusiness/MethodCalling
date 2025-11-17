public class Calculator {

    private int add(int a, int b) {
        return a + b;
    }

    private int multiply(int x, int y) {
        return x * y;
    }

    private double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    private String makeFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    private boolean isAdult(int age) {
        return age >= 18;
    }

    private String greet(String name, String timeOfDay) {
        return "Good " + timeOfDay + ", " + name + "!";
    }

    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private double calculateArea(double width, double height) {
        return width * height;
    }

    private String repeat(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }

    private int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    private boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }

    private String buildMessage(String recipient, int messageNumber, boolean urgent) {
        String prefix = urgent ? "[URGENT] " : "";
        return prefix + "Message #" + messageNumber + " to " + recipient;
    }

    private double applyDiscount(double price, int discountPercent) {
        return price * (1 - discountPercent / 100.0);
    }

    public void run() {
        // Skriv dine metodekald her
        }
}
