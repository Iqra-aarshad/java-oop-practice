import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

public class EventDuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the start date and time (yyyy-MM-dd HH:mm):");
        String startDateTimeStr = sc.nextLine();
        LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeStr);
        
        System.out.println("Enter the end date and time (yyyy-MM-dd HH:mm):");
        String endDateTimeStr = sc.nextLine();
        LocalDateTime endDateTime = LocalDateTime.parse(endDateTimeStr);
        
        Duration duration = Duration.between(startDateTime, endDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        
        System.out.println("Duration of the event: " + hours + " hours and " + minutes + " minutes.");
        
        sc.close();
    }
}
