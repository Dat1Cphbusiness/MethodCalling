public class DataProcessor {

    private void formatMessage(String message, int count, boolean uppercase) {
        String formatted = uppercase ? message.toUpperCase() : message.toLowerCase();
        for (int i = 0; i < count; i++) {
            System.out.println(formatted);
        }
    }

    private void createBox(String content, int width, char border) {
        System.out.println(String.valueOf(border).repeat(width));
        System.out.println(border + " " + content + " " + border);
        System.out.println(String.valueOf(border).repeat(width));
    }

    private void calculatePrice(double basePrice, int quantity, boolean discount, double taxRate) {
        double subtotal = basePrice * quantity;
        if (discount) {
            subtotal = subtotal * 0.9; // 10% discount
        }
        double total = subtotal * (1 + taxRate);
        System.out.println("Base price: $" + basePrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount applied: " + discount);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Total: $" + total);
    }

    private void printPattern(char symbol, int rows, int cols, boolean filled) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (filled || i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void showStatus(String name, int level, double progress, boolean active) {
        System.out.println("User: " + name);
        System.out.println("Level: " + level);
        System.out.println("Progress: " + progress + "%");
        System.out.println("Status: " + (active ? "Active" : "Inactive"));
        System.out.println("---");
    }

    private void convertTemperature(double value, char fromUnit, char toUnit) {
        double celsius;

        // Convert to Celsius first
        if (fromUnit == 'F' || fromUnit == 'f') {
            celsius = (value - 32) * 5.0 / 9.0;
        } else if (fromUnit == 'K' || fromUnit == 'k') {
            celsius = value - 273.15;
        } else {
            celsius = value;
        }

        // Convert from Celsius to target
        double result;
        if (toUnit == 'F' || toUnit == 'f') {
            result = celsius * 9.0 / 5.0 + 32;
        } else if (toUnit == 'K' || toUnit == 'k') {
            result = celsius + 273.15;
        } else {
            result = celsius;
        }

        System.out.println(value + "°" + fromUnit + " = " + result + "°" + toUnit);
    }

    private void displayScore(String playerName, int score, double accuracy, boolean highScore) {
        System.out.println("=== SCORE REPORT ===");
        System.out.println("Player: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Accuracy: " + accuracy + "%");
        if (highScore) {
            System.out.println("🏆 NEW HIGH SCORE! 🏆");
        }
        System.out.println("====================");
    }

    private void makeTable(int rows, int cols, char separator, boolean headers) {
        if (headers) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Col" + (j + 1) + " " + separator + " ");
            }
            System.out.println();
            System.out.println(String.valueOf(separator).repeat(cols * 8));
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("R" + (i + 1) + "C" + (j + 1) + "  " + separator + " ");
            }
            System.out.println();
        }
    }

    // Studerende skal skrive deres metodekald i run()
    public void run() {
        // Din kode her
    }
}