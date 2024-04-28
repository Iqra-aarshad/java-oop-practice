import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first date:");
        String firstDateString = sc.nextLine();

        System.out.print("Enter the second date: ");
        String secondDateString = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date firstDate = dateFormat.parse(firstDateString);
            Date secondDate = dateFormat.parse(secondDateString);

            long difference = Math.abs(secondDate.getTime() - firstDate.getTime());
            long differenceInDays = difference / (24 * 60 * 60 * 1000);

            System.out.println("The difference between the two dates is " + differenceInDays + " days.");
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }

        sc.close();
    }
}
