import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the date and time: ");
        String dateTimeString = sc.nextLine();
        System.out.print("Enter the source time zone: ");
        String sourceTimeZoneString = sc.nextLine();

        System.out.print("Enter the target time zone: ");
        String targetTimeZoneString = sc.nextLine();

        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        ZoneId sourceTimeZone = ZoneId.of(sourceTimeZoneString);

        ZoneId targetTimeZone = ZoneId.of(targetTimeZoneString);

        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(dateTime, sourceTimeZone);

        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetTimeZone);

        String targetDateTimeString = targetZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.println("Converted date and time: " + targetDateTimeString);

        sc.close();
    }
}