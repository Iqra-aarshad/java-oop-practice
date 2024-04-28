import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HolidayCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Map<String, LocalDate> holidays = new HashMap<>();
        holidays.put("New Year's Day", LocalDate.of(year, 1, 1));
        holidays.put("Labour Day", LocalDate.of(year, 05, 1));

        System.out.println("Holidays for " + year + ":");
        for (Map.Entry<String, LocalDate> entry : holidays.entrySet()) {
            String holiday = entry.getKey();
            LocalDate date = entry.getValue();
            System.out.println(holiday + ": " + date);
        }

        scanner.close();
    }
}


