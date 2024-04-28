import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeString = scanner.nextLine();

        boolean isValid = validateDateTime(dateTimeString);

        if (isValid) {
            System.out.println("The input date and time is valid.");
        } else {
            System.out.println("Invalid date and time.");
        }

        scanner.close();
    }

    private static boolean validateDateTime(String dateTimeString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

            LocalDateTime now = LocalDateTime.now();
            if (dateTime.isBefore(now)) {
                return false;
            }

            LocalDateTime maxDateTime = now.plus(1, ChronoUnit.YEARS);
            if (dateTime.isAfter(maxDateTime)) {
                return false;
            }

            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

