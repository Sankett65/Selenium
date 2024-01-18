package seleniumpractice;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClockExample {
    public static void main(String[] args) {
        // Initialize a Clock using the system default time zone
        Clock systemClock = Clock.systemDefaultZone();

        // Get the current time using the system clock
        Instant currentInstant = Instant.now(systemClock);
        System.out.println("Current time using system clock: " + currentInstant);

        // Initialize a Clock with a specific time zone (e.g., UTC)
        ZoneId utcZone = ZoneId.of("UTC");
        Clock utcClock = Clock.system(utcZone);

        // Get the current time using the UTC clock
        Instant utcInstant = Instant.now(utcClock);
        System.out.println("Current time using UTC clock: " + utcInstant);

        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
    }
}

