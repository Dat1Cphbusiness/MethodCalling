public class Robot {

    private void sayHello() {
        System.out.println("Hello! I am a robot.");
    }

    private void drawLine() {
        System.out.println("====================");
    }

    private void beep() {
        System.out.println("*BEEP*");
    }

    private void introduce() {
        System.out.println("My name is RoboHelper 3000.");
    }

    private void showBattery() {
        System.out.println("Battery level: 100%");
    }

    private void wave() {
        System.out.println("  \\o/");
        System.out.println("   |");
        System.out.println("  / \\");
    }

    // Students will write their method calls in run()
    public void run() {
        // Your code here
    }

    // Main method to start the program
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.run();
    }
}
