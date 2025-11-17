public class InfoDisplay {

    private void displayPerson(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    private void printRectangle(int width, int height) {
        System.out.println("Rectangle: " + width + " x " + height);
        System.out.println("Area: " + (width * height));
    }

    private void makeGreeting(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    private void showProduct(String productName, double price, int quantity) {
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + (price * quantity));
    }

    private void createTitle(String title, String subtitle) {
        System.out.println("=".repeat(40));
        System.out.println(title);
        System.out.println(subtitle);
        System.out.println("=".repeat(40));
    }

    private void printRange(int start, int end) {
        System.out.print("Range from " + start + " to " + end + ": ");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + "): " + distance);
    }

    private void showDate(int day, String month, int year) {
        System.out.println("Date: " + day + " " + month + " " + year);
    }

    // Studerende skal skrive deres metodekald i run()
    public void run() {
        // Din kode her
    }
}