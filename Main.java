/**
 * Main class that starts the clock application.
 */
public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock();

        ClockUpdater updater = new ClockUpdater(clock);
        ClockDisplay display = new ClockDisplay(clock);

        // Assign thread priorities
        updater.setPriority(Thread.MIN_PRIORITY); // Priority = 1
        display.setPriority(Thread.MAX_PRIORITY); // Priority = 10

        // Start threads
        updater.start();
        display.start();

        // Display priorities
        System.out.println("Updater Thread Priority : "
                + updater.getPriority());

        System.out.println("Display Thread Priority : "
                + display.getPriority());
    }
}
