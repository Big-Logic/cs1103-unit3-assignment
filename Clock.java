import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clock class responsible for storing and providing
 * the current date and time.
 */
public class Clock {

    // Shared variable between threads
    private volatile String currentDateTime;

    // Formatter for displaying date and time
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");

    /**
     * Updates the current date and time.
     */
    public synchronized void updateTime() {
        currentDateTime = LocalDateTime.now().format(formatter);
    }

    /**
     * Returns the latest updated time.
     */
    public synchronized String getCurrentDateTime() {
        return currentDateTime;
    }
}