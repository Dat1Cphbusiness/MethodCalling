class MessageMaker {

    private void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private void printNumber(int num) {
        System.out.println("The number is: " + num);
    }

    private void countdown(int start) {
        System.out.println("Counting down from " + start + ":");
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private void repeatWord(String word) {
        System.out.println(word + " " + word + " " + word);
    }

    private void showPrice(double price) {
        System.out.println("Price: $" + price);
    }

    private void celebrate(String event) {
        System.out.println("🎉 Celebrating: " + event + " 🎉");
    }

    // Students will write their method calls in run()
    public void run() {
        // Your code here
    }
}
