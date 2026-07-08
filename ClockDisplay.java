/**
 * Thread responsible for displaying the current
 * date and time on the console.
 */
public class ClockDisplay extends Thread {

    private final Clock clock;

    public ClockDisplay(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {

        while (true) {

            try {

                System.out.println(
                        "Current Time: " + clock.getCurrentDateTime());

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println("Display thread interrupted.");
                break;
            }
        }
    }
}