import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the event start date and time (yyyy-MM-dd HH:mm): ");
        String startTimeString = scanner.nextLine();
        LocalDateTime startTime = LocalDateTime.parse(startTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.print("Enter the event end date and time (yyyy-MM-dd HH:mm): ");
        String endTimeString = scanner.nextLine();
        LocalDateTime endTime = LocalDateTime.parse(endTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();

        System.out.println("Duration of the event: " + hours + " hours and " + minutes + " minutes");

        scanner.close();
    }
}
