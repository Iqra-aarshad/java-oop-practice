import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first date (YYYY-MM-DD):");
        String firstDateStr = scanner.next();
        LocalDate firstDate = LocalDate.parse(firstDateStr);
        
        System.out.println("Enter the second date (YYYY-MM-DD):");
        String secondDateStr = scanner.next();
        LocalDate secondDate = LocalDate.parse(secondDateStr);
        
        long differenceInDays = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Difference between the two dates in days: " + Math.abs(differenceInDays));
        
        scanner.close();
    }
}
