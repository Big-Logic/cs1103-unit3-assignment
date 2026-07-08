/**
 * Thread responsible for updating the clock every second.
 */
public class ClockUpdater extends Thread {

    private final Clock clock;

    public ClockUpdater(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {

        while (true) {

            try {

                clock.updateTime();

                // Update every second
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println("Clock updater interrupted.");
                break;
            }
        }
    }
}